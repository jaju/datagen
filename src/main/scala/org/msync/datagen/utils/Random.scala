package org.msync.datagen
package utils

import java.lang.Math
object Random {
  def int(max : Int) : Int = (Math.random() * max).asInstanceOf[Int]
}
