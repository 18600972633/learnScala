package com.example.scala.chapter10.tuple

/**
  * 元组
  *
  * 元组也是可以理解为一个容器，可以存放各种相同或不同类型的数据。
  * 说的简单点，就是将多个无关的数据封装为一个整体，称为元组,
  * 最大的特点灵活,对数据没有过多的约束。
  *
  * 注意：元组中最大只能有22个元素
  *
  *
  */
object Demo01 {

  def main(args: Array[String]): Unit = {

    val t = (1, 2, 3.14, "jack")
    println(t._1)
    println(t._2)
    println(t._3)
    println(t._4)

    println("--------------------------------")

    for (elem <- t.productIterator) {
      println(elem)
    }

    println("--------------------------------")

    //    访问元组中的数据,可以采用顺序号（_顺序号），也可以通过索引（productElement）访问。
    println(t.productElement(0))

  }

}
