package com.example.scala.chapter07.mxdx.chouxianglei

/**
  * 抽象类
  *
  */
/**
  * Scala抽象类使用的注意事项和细节讨论
  * 抽象类不能被实例
  * 抽象类不一定要包含abstract方法。也就是说,抽象类可以没有abstract方法
  * 一旦类包含了抽象方法或者抽象属性,则这个类必须声明为abstract
  *
  * 抽象方法不能有主体，不允许使用abstract修饰。
  * 如果一个类继承了抽象类，则它必须实现抽象类的所有抽象方法和抽象属性，除非它自己也声明为abstract类。【案例演示+反编译】
  * 抽象方法和抽象属性不能使用private、final 来修饰，因为这些关键字都是和重写/实现相违背的。
  * 抽象类中可以有实现的方法.
  * 子类重写抽象方法不需要override，写上也不会错.
  *
  */
object Demo01 {

  def main(args: Array[String]): Unit = {
    val tom = new AsiaPerson("tom", 18)
    tom.run()
    tom.play("football")
  }

}

/**
  * 定义一个抽象类 Person
  * 1. 构造方法   Person(nameIn: String, var ageIn: Int)
  * 2. 抽象成员   var height: Double ;  val education: String
  * 3. 抽象方法   def eat(food: String)
  *
  *
  */
abstract class Person(nameIn: String, ageIn: Int) {

  var name: String = nameIn
  var age: Int = ageIn

  var height: Double

  val education: String

  def eat(food: String)

  def run()

  def play(s: String): Unit = {
    println(s"$name like play $s very much")
  }

}

class AsiaPerson(name: String, age: Int) extends Person(name, age) {
  override var height: Double = _
  override val education: String = "unknown"

  override def eat(food: String): Unit = {

  }

  override def run(): Unit = {
    println(s"$name run quickly ...")
  }
}

