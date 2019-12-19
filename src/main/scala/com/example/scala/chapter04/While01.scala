package com.example.scala.chapter04

import util.control.Breaks._

/**
  */
object While01 {

  def main(args: Array[String]): Unit = {

    //    var i = 0
    //    while (i < 10) {
    //      println(i)
    //      i += 1
    //    }


    /**
      * import util.control.Breaks._
      * 实现 break 的效果
      * breakable  break()
      *
      * 使用循环守卫可以实现 continue , 或者在循环体中使用 if else
      */
    breakable {
      for (i <- 1 to 20) {
        println(i)
        if (i == 11) break()
      }
    }
  }
}


object brealTest01 {

  // 也可以使用循环守卫实现
  def main(args: Array[String]): Unit = {

    var sum = 0
    breakable {
      for (i <- Range(1, 100, 1)) {
        sum += i
        if (sum >= 20) {
          println(s"sum = $sum , i = $i")
          break()
        }

      }

    }

  }

}
