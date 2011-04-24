package org.msync.datagen
package strings
import java.lang.{String, StringBuffer}
import org.msync.datagen.utils._

class RandomChar extends SeqTrait[Char] {
  var streamIter = util.Random.alphanumeric.iterator
  override def next : Char = streamIter.next()
}

class RandomString(minLength : Int = 1, maxLength : Int = 10) extends SeqTrait[String] {
  var charSeq = new RandomChar()
  def next(length : Int) : String = {
    var sb = new StringBuffer()
    for (i <- 0 until length) { 
      sb.append(charSeq.next)
    }
    return sb.toString()
  }

  override def next : String = {
    var length = scala.math.max(minLength, Random.int(maxLength))
    return next(length)
  }
}
