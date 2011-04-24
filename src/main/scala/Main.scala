import org.datagen.SeqTrait
import org.datagen.base._

object Main {

  def printAFew[A](seq : SeqTrait[A], i : Int) : Unit = { 
    var counter = i
    while (counter > 0) {
      counter -= 1
      println(seq.next)
    }
    println("**************** DONE ******************")
  }

  def main(args : Array[String]) {
    var is = new Integer()
    var irs = new RandomRangeInteger()
    var mirs = new MonotonicRandomInteger()
    var pis = new PerturbedInteger()
    printAFew(is, 10)
    printAFew(irs, 10)
    printAFew(mirs, 10)
    printAFew(pis, 10)
  }
}
