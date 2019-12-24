package com.example.scala.chapter10.list

/**
  * 列表 List-元素的追加
  * 向列表中增加元素, 会返回新的列表/集合对象。注意：Scala中List元素的追加形式非常独特，和Java不一样。
  *
  */
object Demo03 {

  def main(args: Array[String]): Unit = {

    val list = List(3, 4, 5)
    val l2 = list :+ 6 // 向列表尾部增加元素
    println(l2.mkString(","))

    val l3 = 2 +: list // 向列表头部增加元素
    println(l3.mkString(","))

    println(list.mkString(","))

  }

}
