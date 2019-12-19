package com.example.scala.chapter06.construct

/**
  * 构造器
  * 主构造器  , 辅助构造器
  *
  */

/**
  * 主构造器和辅助构造器的细节
  *
  */


object Test01 {

  def main(args: Array[String]): Unit = {

    //    val dog = new Dog("jack")
    //    dog.say()
    //    println(dog.name)

    val dog = new Dog("", 100)
    dog.say()

  }

}


class Dog(inName: String) {

  var name: String = inName

  var color = ""

  var age = 0

  // 辅助构造器
  // 辅助构造器可以有多个 , 辅助构造器必须直接或者间接的调用主构造器

  // 思考 : 为什么在辅助构造器中必须首先调用主构造器 ? ?

  def this(name: String, age: Int) {
    this("警犬")
    this.age = age
  }

  def say(): Unit = {
    println("i am dog , my name is " + name)
  }


}
