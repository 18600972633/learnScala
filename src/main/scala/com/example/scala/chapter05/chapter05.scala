package com.example.scala.chapter05

/**
  * 函数式编程
  * 把函数当做一等公民, 充分利用函数, 支持函数的多种使用方式。
  * 函数的创建不再依赖于类或对象
  *
  * 函数的定义
  * def sum(a: Int, b: Int, c: Int): Long = { }
  *
  * 函数(方法)的调用机制
  * 方法栈
  *
  *
  * 递归
  *
  * 函数使用注意事项和细节
  * 1.
  *
  */


object chapter05 {

  def main(args: Array[String]): Unit = {

    println(sum(9, 0, 2))

  }

  def sum(a: Int, b: Int, c: Int): Long = {
    a * 100 + b * 10 + c
  }

}

