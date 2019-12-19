package com.example.scala.chapter05

/**
  * 递归
  *
  */
object DiGui {

  def main(args: Array[String]): Unit = {

    // test01(4) // 输出结果  2 3 4

    test02(4) // 输出 2

  }

  /**
    * 递归
    *
    */
  def test01(n: Int): Unit = {
    if (n > 2) {
      test01(n - 1)
    }
    println(s"n = $n")
  }

  /**
    * 尾递归
    */
  def test02(n: Int): Unit = {
    if (n > 2) {
      test02(n - 1)
    } else {
      println(s"n = $n")
    }
  }

}
