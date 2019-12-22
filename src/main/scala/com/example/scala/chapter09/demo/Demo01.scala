package com.example.scala.chapter09.demo

/**
  * 隐式函数基本介绍
  *
  * 隐式转换函数是以 implicit 关键字声明的带有单个参数的函数。
  * 这种函数将会自动应用，将值从一种类型转换为另一种类型
  *
  *
  */


/**
  * 隐式转换的注意事项和细节
  *
  * 隐式转换函数的函数名可以是任意的，隐式转换与函数名称无关，只与函数签名（函数参数类型和返回值类型）有关。
  * 隐式函数可以有多个(即：隐式函数列表)，但是需要保证在当前环境下，只有一个隐式函数能符合转换条件
  * 在当前环境下 , 不能有多个隐式转换函数 , 函数签名相同。
  *
  */
object Demo01 {


  /**
    * 自定义一个隐式转换函数
    * 将 double 转换成 int
    *
    */
  implicit def double2Int(d: Double): Int = {
    d.toInt
  }

  def main(args: Array[String]): Unit = {

    val a = 10
    // 这里存在隐式转换, 低精度 Int 自动转成高精度 double
    val age: Double = a
    println(age)

    // 隐式转换
    val cc: Int = 3.14
    println(cc)


  }

}
