package com.example.scala.chapter04

/**
  *
  * for(i <- 1 to 10)
  *
  * 循环守卫 , 条件判断式 , 守卫
  * 条件满足时执行 , 条件不满足时不执行 , 可以实现类似于 continue 功能
  *
  */
object For01 {

  def main(args: Array[String]): Unit = {

    val f = (num: Int) => num % 3 == 0
    for (i <- 1 until 100 if f(i)) {
      println(i)
    }

  }

}


/**
  * 引入变量
  * for( i <- 1 to 10 ; j = i*10)
  */
object for03 {
  def main(args: Array[String]): Unit = {

    for (i <- 1 to 9; j = i + 10) {
      println(i * j)
    }
  }

}