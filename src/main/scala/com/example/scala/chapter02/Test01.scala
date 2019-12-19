package com.example.scala.chapter02

/**
  * var val 的区别
  * val 修饰的变量不可修改  final
  */
object Test01 {

  def main(args: Array[String]): Unit = {

    val num = 100
    println(num)
    println(num.isInstanceOf[Double])

  }

}
