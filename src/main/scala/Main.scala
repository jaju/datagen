import org.msync.datagen.SeqTrait
import org.msync.datagen.numbers._

object Main {

  def printAFew[A](seq : SeqTrait[A], i : Int = 5, msg : String = "Sequence") : Unit = {
    println("**************** " + msg + "******************")
    for (counter <- 0 until i) {
      println(seq.next)
    }
    println("**************** DONE ******************")
    println
  }

  def main(args : Array[String]) {
    printAFew(new Integer(), msg = "Integers")
    printAFew(new RandomRangeInteger(), msg = "Random Integers in a given range")
    printAFew(new MonotonicRandomInteger(), msg = "Monotonically increasing (pseudo) random numbers")
    printAFew(new PerturbedInteger(), msg = "Increasing integers perturbed within a range")
    printAFew(new org.msync.datagen.strings.String(minLength = 5, maxLength = 10), msg = "Random strings with length between some range")
  }
}
