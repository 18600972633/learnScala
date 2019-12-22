package com.example.scala.chapter08.leixingtouying

/**
  * 类型投影
  *
  * 类型投影是指：在方法声明上，如果使用  外部类#内部类  的方式，
  * 表示忽略内部类的对象关系，等同于Java中内部类的语法操作，
  * 我们将这种方式称之为 类型投影（即：忽略对象的创建方式，只考虑类型）
  *
  */
object Demo01 {

  def main(args: Array[String]): Unit = {

    val outer01 = new Outer("aa")
    val innner01 = new outer01.Innner
    innner01.say(outer01)

    val bb = new Outer("bb")
    val inner2 = new bb.Innner
    inner2.say(outer01)

  }

}


class Outer(var name: String) {


  // 内部类
  class Innner {
    def say(outer: Outer): Unit = {
      println(s"father name is ${outer.name}")
    }

  }


}


object Outer {

  // 静态内部类
  class SataticInnerClass {

  }

}
