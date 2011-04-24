package org.msync.datagen
package base

class MonotonicRandomInteger(maxJump : Int = 10) extends Integer {
  
  var jumper = new RandomRangeInteger(0, maxJump)

  def jump : Int = {
    return jumper.next()
  }

  override def next() : Int = { 
    super.advance(jump)
    return super.next
  }
}
