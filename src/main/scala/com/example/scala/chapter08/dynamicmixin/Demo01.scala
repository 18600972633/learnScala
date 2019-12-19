package com.example.scala.chapter08.dynamicmixin

/**
  * 动态混入
  */

/**
  * 带有特质的对象，动态混入
  *
  * 除了可以在类声明时继承特质以外，还可以在构建对象时混入特质，扩展目标类的功能
  * 此种方式也可以应用于对抽象类功能进行扩展
  * 动态混入是Scala特有的方式（java没有动态混入），可在不修改类声明/定义的情况下，扩展类的功能，非常的灵活，耦合性低 。
  * 动态混入可以在不影响原有的继承关系的基础上，给指定的类扩展功能。
  *
  *
  */
object Demo01 {

  def main(args: Array[String]): Unit = {

    val a = new A with Operate {}

    val b = new B with Operate {}

    val c = new C with Operate {
      override def say(): Unit = {
        println("c say something")
      }
    }

    a.insert(1)
    b.insert(2)
    c.insert(3)
    c.say()


  }

}

trait Operate {
  def insert(id: Int): Unit = {
    println(s"insert id = $id")
  }
}


class A {
}

abstract class B {

}

abstract class C {
  def say()
}








































































































