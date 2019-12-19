package com.example.scala.chapter02

/**
  * 数据类型
  * 数据类型都是对象 , 完全面向对象
  *
  * 数据类型一览图
  *
  * Any
  * AnyVal (值类型)
  * AnyRef (引用类型)
  *
  * Unit      返回值为空        ()
  * Null      引用类型为空      null
  * Nothing   所有类型的父类型
  *
  * 隐式转换
  *
  * 自动类型转换 : 小的类型自动转换成大的类型
  *
  *
  * 强制类型转换 : 大类型强制转换成小的类型
  *
  *
  * 值类型与 string 相互转换
  * 基本数据类型转 string
  * string 转基本数据类型
  *
  *
  */
object Test02 {

  def main(args: Array[String]): Unit = {

    //    println("a" * 3)
    //    println("abcd".head)
    //    println("abcd".last)
    //
    //    println(10 max 11)
    //
    //    println(BigInt(2).pow(100))

    println("abcd".take(3))
    println("abcdefg".takeRight(3))

  }

}

object test01 {
  def main(args: Array[String]): Unit = {

    println(2.11.toInt)
    println("3.1415926".toDouble)
    println("true".toBoolean)
    //    println("12.5".toInt)

  }
}

