package org.msync.datagen
package strings
import java.lang.{String => JString, StringBuffer}
import java.lang.Math

class RandomChar extends SeqTrait[Char] {
  var streamIter = util.Random.alphanumeric.iterator
  override def next : Char = streamIter.next()
}

class String(minLength : Int = 1, maxLength : Int = 10) extends SeqTrait[JString] {
  def randomInt(max : Int) : Int = (Math.random() * max).asInstanceOf[Int]
  var charSeq = new RandomChar()
  def next(length : Int) : JString = {
    var sb = new StringBuffer()
    for (i <- 0 until length) { 
      sb.append(charSeq.next)
    }
    return sb.toString()
  }

  override def next : JString = {
    var length = Math.max(minLength, randomInt(maxLength))
    return next(length)
  }
}
