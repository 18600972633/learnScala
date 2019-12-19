package com.example.scala.chapter05

/**
  * 异常
  *
  */
object ExTest01 {

  def main(args: Array[String]): Unit = {

    f1()
    println("0000")


    try {
      println("111")
      if (1 > 0)
        throw new NullPointerException
      println(1 / 0)
      println(222)

    } catch {
      case ex: NullPointerException => println("e1" + ex.printStackTrace())
      case ex: Exception => println("e2")
    } finally {
      println("finally")
    }


  }

  // @throws 表明函数可能会抛出的异常
  @throws(classOf[NullPointerException])
  @throws(classOf[ArithmeticException])
  def f1(): Unit = {
    println("f1")
  }

}
