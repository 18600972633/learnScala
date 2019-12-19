package com.example.scala.chapter07.mxdx.nimingzilei

/**
  * 匿名子类
  *
  */
object Demo01 {

  def main(args: Array[String]): Unit = {

    val p = new Persion {
      override def say(words: String): Unit = {
        println(s" say $words")
      }
    }

    p.say("hello rrrrrrrrrr rrr")
  }


}

abstract class Persion {

  def say(words: String)

}
