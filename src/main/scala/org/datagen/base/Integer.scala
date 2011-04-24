package org.datagen
package base

class Integer extends SeqTrait[Int] { 
  private var i : Int = 0

  def next() : Int = { 
    i += 1
    return i
  }
}
