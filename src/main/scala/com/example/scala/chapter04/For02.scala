package com.example.scala.chapter04

/**
  * 嵌套循环
  *
  */
object For02 {

  def main(args: Array[String]): Unit = {

    for (i <- 1 to 9; j <- 1 to i) {
      print(s"$j * $i = ${i * j}")
      if (i == j) println() else print("\t")
    }

  }

}

/**
  * yield
  */
object for022 {
  def main(args: Array[String]): Unit = {

    val res = for (i <- 1 to 20 if i % 3 == 0)
      yield i + 1000
    println(res)

  }
}

/**
  * for 步长  Range(start , end , step)
  */
object for023 {
  def main(args: Array[String]): Unit = {

    for (i <- Range(1, 100, 3)) {
      println(i)
    }

  }
}
