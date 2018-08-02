/**
  * Created by Jai Prakash <jprakash@live.com.au>
  *
  */

package com.jai.string
import collection.mutable.ListBuffer
import org.scalatest._


class TestCompressor extends FlatSpec {

  "CompressStr" should "return a string respecting the minimum occurence count" in {
    assert(Compressor.compressStr("ABBCDD", 2) == "A2BC2D")
    assert(Compressor.compressStr("ABBBCCDDD", 3) == "A3BCC3D")
    assert(Compressor.compressStr("ABBBCCDDD", 4) == "ABBBCCDDD")
    assert(Compressor.compressStr("", 1) == "")
  }

  "Get Item Str" should "return entire items or one character string based on occurrence count" in {
    var i:ListBuffer[Char] = ListBuffer[Char]('A', 'A')
    assert(Compressor.getItemStr(i, 1) == "2A")
    i = ListBuffer[Char]('A', 'A')
    assert(Compressor.getItemStr(i, 2) == "2A")
    i = ListBuffer[Char]('A', 'A')
    assert(Compressor.getItemStr(i, 3) == "AA")
  }
}
