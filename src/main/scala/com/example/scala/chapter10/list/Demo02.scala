package com.example.scala.chapter10.list

/**
  * 列表 List-元素的追加
  *
  * 向列表中增加元素, 会返回新的列表/集合对象。
  * 注意：Scala中List元素的追加形式非常独特，和Java不一样。
  *
  */
object Demo02 {

  def main(args: Array[String]): Unit = {

    val list = List(1, 2, 3)
    val l2 = list :+ 4 // 向 List 尾部增加元素
    println(list)
    println(l2)

  }

}

object Demo021 {

  def main(args: Array[String]): Unit = {

    val list = List(1, 2, 3)
    val l2 = 4 +: list // 向 List 头部添加元素
    println(list)
    println(l2)

  }

}

/**
  * 符号::表示向集合中  新建集合添加元素。
  * 运算时，集合对象一定要放置在最右边，
  * 运算规则，从右向左。
  * ::: 运算符是将集合中的每一个元素加入到空集合中去
  *
  */
object Demo022 {

  def main(args: Array[String]): Unit = {

    val l1 = List(0, 1)
//    val list = 1 :: 2 :: 3 :: Nil
    val list = 1 :: 2 :: 3 :: l1
    println(list)

  }

}

