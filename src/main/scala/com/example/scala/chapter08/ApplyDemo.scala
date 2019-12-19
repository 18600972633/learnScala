package com.example.scala.chapter08

/**
  * 在伴生对象中创建 apply 方法 , 通过 apply 方法来创建类对象
  */
object ApplyDemo {

  def main(args: Array[String]): Unit = {

    //    val list = List(1, 2, 3)
    //    println(list)
    val a = A("jack") // 等价于 A.apply("jack")
    a.say()

  }

}

class A(nameIn: String) {
  var name: String = nameIn

  def say(): Unit = {
    println(s"my name is $name")
  }

}

object A {

  def apply(name: String): A = new A(name)


}
