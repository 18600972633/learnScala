package com.example.scala.chapter09.yingshizhi

/**
  * 隐式值也叫隐式变量，将某个形参变量标记为 implicit ，
  * 所以编译器会在方法省略隐式参数的情况下 , 去搜索作用域内的隐式值作为缺省参数
  *
  */
object Demo01 {

  // 隐式值
  implicit val name = "aa"
  //  implicit val name2 = "bb"

  // 隐式参数
  // 注意 : 不能在同一范围内 找到多个符合条件的 隐式值 . 有且只能有一个
  def say(implicit s: String = "cc"): Unit = {
    println("say name = " + s)
  }

  def main(args: Array[String]): Unit = {

    say("rose")
    say()
    say
    //    say name = rose
    //    say name = cc
    //    say name = aa

  }

}
