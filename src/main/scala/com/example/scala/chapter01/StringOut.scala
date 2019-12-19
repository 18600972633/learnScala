package com.example.scala.chapter01

/**
  * @author : gaohui
  * @Date : 2019/11/6 22:15
  * @Description :   
  *
  */
object StringOut {

  def main(args: Array[String]): Unit = {
    val name = "jack"
    val age = 18
    val score = 94.5

    // 字符串插值器
    println(s"name = $name , age = ${age + 100} , score = $score")

    // 格式化输出
    printf("name = %s , age = %d , score = %f \n", name, age, score)
    print("......")
  }

}
