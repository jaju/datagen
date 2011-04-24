package org.msync.datagen
package strings

import utils.Random

class PoolString(var pool : Array[String] = null) extends SeqTrait[String] {
  if (pool == null) { 
    pool = new Array[String](1)
    pool(0) = new String("")
  }
  lazy val poolLength = pool.length
  override def next = pool(Random.int(poolLength))
}
