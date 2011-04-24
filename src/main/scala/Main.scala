import org.msync.datagen.SeqTrait
import org.msync.datagen.numbers._

object Main {

  def printAFew[A](seq : SeqTrait[A], i : Int = 15) : Unit = { 
    var counter = i
    while (counter > 0) {
      counter -= 1
      println(seq.next)
    }
    println("**************** DONE ******************")
  }

  def main(args : Array[String]) {
    printAFew(new Integer())
    printAFew(new RandomRangeInteger())
    printAFew(new MonotonicRandomInteger())
    printAFew(new PerturbedInteger())
  }
}
