package com.example.scala.chapter05

/**
  *
  * 惰性函数
  *
  * 当函数返回值被 lazy 修饰时 , 只有在返回值被使用到时, 函数才会被执行
  *
  *
  */
object LazyTest {

  def main(args: Array[String]): Unit = {

    println("111")
    lazy val res = f1()
    println(222)
    println(res)


  }

  def f1(): Int = {
    println("f1 .....")
    10000
  }

}
