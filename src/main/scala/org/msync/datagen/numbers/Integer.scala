package org.msync.datagen
package numbers

class Integer extends SeqTrait[Int] { 
  private var i : Int = 0

  def advance(jump : Int = 1) = i += jump

  def next() : Int = { 
    i += 1
    return i
  }
}
