package com.example.scala.chapter06.construct

import scala.beans.BeanProperty


/**
  * 属性高级  在构造方法中对属性增加修饰符
  * 1. 不加修饰符  只能在构造方法中使用的局部变量
  * 2. val 成为一个只读的属性
  * 3. var 陈成为一个可读可写的属性
  */


/**
  * 对象创建流程分析
  * 1. 加载类的信息(属性信息,方法信息)
  * 2. 在堆内存中开辟空间
  * 3. 初始化父类 , 使用主构造器对属性初始化
  * 4. 调用辅助构造器
  * 5. 将对象地址赋给引用
  */

object ShuXing {

  def main(args: Array[String]): Unit = {
    val a = new A("a")
    val b = new B("b")
    val c = new C("c")


    //a.
    println(b.name)
    //    b.name = "bb"
    println(c.name)
    c.name = "cc"
    println(c.name)
    println(c.getName)

  }

}


class A(name: String) {
  //  println(name)
}

class B(val name: String) {

}

class C(@BeanProperty var name: String) {

}
