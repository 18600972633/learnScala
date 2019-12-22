package com.example.scala.chapter10.array

import scala.collection.mutable.ArrayBuffer

/**
  * 数组-变长数组(声明泛型)
  *
  *
  * 基本使用和应用案例
  * 定义/声明
  * val arr2 = ArrayBuffer[Int]()
  * 追加值/元素
  * arr2.append(7)
  * 重新赋值
  * arr2(0) = 7
  *
  */
object Demo02 {

  def main(args: Array[String]): Unit = {

    val ab = ArrayBuffer[Int](1, 2)
    ab.append(3, 4)
    println(ab)
  }

}

/**
  * 变长数组分析小结
  *
  * ArrayBuffer 是变长数组，类似java的ArrayList
  * val arr2 = ArrayBuffer[Int]() 也是使用的apply方法构建对象
  * def append(elems: A*) { appendAll(elems) } 接收的是可变参数.
  * 每append一次，arr在底层会重新分配空间，进行扩容，arr2的内存地址会发生变化，也就成为新的ArrayBuffer*
  *
  */
