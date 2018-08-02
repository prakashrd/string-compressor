/**
  * Created by Jai Prakash <jprakash@live.com.au>
  *
  */

package com.jai.string

import collection.mutable.ListBuffer
import org.rogach.scallop.ScallopConf

class Conf(args:Seq[String]) extends ScallopConf(args) {
  val inputString = opt[String](required = true)
  val minimumOccurency = opt[Int](required = true)

  verify()
}

object Compressor {

  def main(args:Array[String]): Unit = {
    val conf = new Conf(args)
    val inputString = conf.inputString.getOrElse("")
    val minimumOccurency = conf.minimumOccurency.getOrElse(1)
    println("Compressed string is '" + compressStr(inputString, minimumOccurency) + "'")
  }

  /**
    * Break down the given input string into lists of repeatable consecutive characters
    * and apply the minimum threshold occurrence logic to deduce the compressed string.
    * @param input
    * @param minOccurency
    * @return compressed string
    */
  def compressStr(input:String, minOccurency:Int): String = {
    var inputStrBuffer = ListBuffer[ListBuffer[Char]]()
    var items = ListBuffer[Char]()
    var prev = ""

    input.foreach(s => {
      if (prev != s.toString && prev != "") {
        inputStrBuffer += items
        items = ListBuffer[Char]()
      }
      items += s
      prev = s.toString
    })
    inputStrBuffer += items

    inputStrBuffer.map(getItemStr(_, minOccurency)).mkString("")

  }

  def getItemStr(items:ListBuffer[Char], minimumCount:Int) : String = {
    if (items.length >= minimumCount) {
      items.length.toString + items(0).toString
    } else {
      items.mkString("")
    }
  }
}
