package com.example.scala.chapter10.array

/**
  * 二维数组
  */
object Demo04 {

  def main(args: Array[String]): Unit = {

    // 表示数组有 5 个元素 , 每个元素是一个 长度为 2 的 Int 数组
    val array = Array.ofDim[Int](5, 2)

    array(0)(0) = 1
    array(0)(1) = 2

    println(array(0).mkString(","))

  }

}
