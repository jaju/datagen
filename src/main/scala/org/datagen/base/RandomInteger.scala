package org.datagen
package base

import java.lang.Math

class RandomRangeInteger(min : Float = 0, max : Float = 100) extends SeqTrait[Int] {
  override def next() : Int = { 
    return (Math.random() * (max - min)).asInstanceOf[Int]
  }
}
