import org.msync.datagen.SeqTrait
import org.msync.datagen.numbers._
import org.msync.datagen.strings._

object Main {

  def printAFew[A](seq : SeqTrait[A], i : Int = 5, msg : String = "Sequence") : Unit = {
    println("**************** " + msg + "******************")
    for (counter <- 0 until i) {
      println(seq.next)
    }
    println("**************** DONE ******************")
    println
  }
  
  var stringPool = List("com", "org", "net", "in", "ac", "au")

  def readFileIntoArray(filename : String) : Array[String] = {
    var lines = scala.io.Source.fromFile(filename).getLines
    var a = new Array[String](0)
    while (lines.hasNext) {
      var line = lines.next()
      a = a :+ line
    }
    return a
  }

  def main(args : Array[String]) {
    printAFew(new Integer(), msg = "Integers")
    printAFew(new RandomRangeInteger(), msg = "Random Integers in a given range")
    printAFew(new MonotonicRandomInteger(), msg = "Monotonically increasing (pseudo) random numbers")
    printAFew(new PerturbedInteger(), msg = "Increasing integers perturbed within a range")
    printAFew(new RandomString(minLength = 5, maxLength = 10), msg = "Random strings with length between some range")
    printAFew(new PoolString(Array[String](stringPool:_*)), msg = "Strings from a pool")
    printAFew(new PoolString(readFileIntoArray("/etc/passwd")), msg = "Strings from the /etc/passwd pool")
  }
}
