package com.example.scala.chapter10.array

/**
  * 定长数组与变长数组的转换
  *
  * arr1.toBuffer  //定长数组转可变数组
  * arr2.toArray  //可变数组转定长数组
  * 说明：
  * arr2.toArray 返回结果才是一个定长数组， arr2本身没有变化
  * arr1.toBuffer返回结果才是一个可变数组， arr1本身没有变化
  *
  */
object Demo03 {

  def main(args: Array[String]): Unit = {

    val a1 = Array(1, 2)
    val ab1 = a1.toBuffer

    val a2 = ab1.toArray

    println(ab1)
    println(a2.mkString(","))

  }

}
