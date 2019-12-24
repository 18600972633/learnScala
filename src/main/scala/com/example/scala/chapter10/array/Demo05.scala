package com.example.scala.chapter10.array

import scala.collection.mutable.ArrayBuffer

/**
  * 数组-Scala数组与Java的List的互转
  */
object Demo05 {

  def main(args: Array[String]): Unit = {

    // Scala集合和Java集合互相转换
    val arr = ArrayBuffer("1", "2", "3")
    import scala.collection.JavaConversions.bufferAsJavaList
    val javaArr = new ProcessBuilder(arr) //为什么可以这样使用?
    val arrList = javaArr.command()
    println(arrList) //输出 [1, 2, 3]


  }

}
