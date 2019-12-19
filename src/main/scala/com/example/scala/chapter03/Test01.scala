package com.example.scala.chapter03

/**
  * 运算符
  * 算术运算符
  * 赋值运算符
  * 关系运算符
  * 逻辑运算符
  * 位运算
  */
object Test01 {

  def main(args: Array[String]): Unit = {
    val days = 97
    val v1 = days / 7.000
    println(s"week = ${v1.toInt} , day = ${((v1 - v1.toInt) * 7).toInt}")
    println(days / 7 + " : " + days % 7)
  }


}
