package com.example.scala.chapter10.list

/**
  * List 基本介绍
  *
  * Scala中的List 和Java List 不一样，在Java中List是一个接口，真正存放数据是ArrayList，
  * 而Scala的List可以直接存放数据，就是一个object，默认情况下Scala的List是不可变的，List属于序列Seq。
  * val List = scala.collection.immutable.List
  * object List extends SeqFactory[List]
  *
  */

/**
  * 创建List的应用案例小结
  *
  * List默认为不可变的集合
  * List 在 scala包对象声明的,因此不需要引入其它包也可以使用
  * val List = scala.collection.immutable.List
  * List 中可以放任何数据类型，比如 arr1的类型为 List[Any]
  * 如果希望得到一个空列表，可以使用Nil对象, 在 scala包对象声明的,因此不需要引入其它包也可以使用
  *
  */
object Demo01 {

  def main(args: Array[String]): Unit = {
    val l1 = List(1, 5, 4, 3)
    println(l1)

    val l2 = Nil
    println(l2)

    // 1是索引，表示取出第2个元素
    println(l1(1))

  }

}
