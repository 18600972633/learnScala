package com.example.scala.chapter10.array

/**
  * 第一种方式定义数组
  * 这里的数组等同于Java中的数组,中括号的类型就是数组的类型
  * val arr1 = new Array[Int](10)
  * //赋值,集合元素采用小括号访问
  * arr1(1) = 7
  *
  *
  */
object Demo01 {

  def main(args: Array[String]): Unit = {
    val array = new Array[Int](10)
    array(1) = 2
    //    println(array(1))

    for (elem <- array) {
      println(elem)
    }
  }

}


/**
  * 第二种方式定义数组
  *
  * 在定义数组时，直接赋值
  * 使用apply方法创建数组对象
  * val arr1 = Array(1, 2)
  */
object Demo011 {

  def main(args: Array[String]): Unit = {
    val array = Array(1, 2, 3, 4, 5)
    println(array(1))
  }

}

