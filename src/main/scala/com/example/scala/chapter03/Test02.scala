package com.example.scala.chapter03

import scala.io.StdIn

/**
  * 控制台输入
  * scala.io.StdIn
  *
  */
object Test02 {

  def main(args: Array[String]): Unit = {

    println("请输入姓名 : ")
    val name = StdIn.readLine()
    println("请输入分数 :")
    val score = StdIn.readInt()
    println(s"name = $name , score = $score")

  }

}
