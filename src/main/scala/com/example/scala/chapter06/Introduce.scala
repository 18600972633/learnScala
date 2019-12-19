package com.example.scala.chapter06


/**
  * 面向对象编程
  *
  * 如何定义一个类
  *
  * 属性的注意事项 :
  * 属性必须显示的初始化
  *
  */

/**
  * 理解 函数式编程
  * 是一种编程范式 , 函数是一等公民。
  *
  * 回复
  * 函数 惰性函数  异常
  */
object Introduce {

  def main(args: Array[String]): Unit = {

    val cat = new Cat("red")
    println(cat.color)
    println(cat.age)


  }

}


class Cat(ageIn: Int) { // 主构造器

  var name: String = ""

  var age: Int = ageIn

  var color: String = _

  def this(color: String) { // 辅助构造器
    this(1000) // 必须要显示的调用主构造器
    this.color = color
  }

}
