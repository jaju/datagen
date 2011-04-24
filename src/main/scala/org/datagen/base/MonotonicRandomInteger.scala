package org.datagen
package base

import java.util.Random
import java.lang.Math

class MonotonicRandomInteger extends Integer {
  private var Min = 0.0
  private var Max = 10.0

  def jump : Int = {
    return (Math.random() * ( Max - Min )).asInstanceOf[Int]
  }

  override def next() : Int = { 
    var skip = jump
    while (skip > 0) { 
      skip -= 1
      super.next
    }
    return super.next
  }
}
