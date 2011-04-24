package org.msync.datagen
package numbers

class PerturbedInteger(perturbation : Int = 5) extends Integer {
  var perturber = new RandomRangeInteger(0, perturbation)

  override def next() : Int = {
    return super.next + perturber.next
  }
}
