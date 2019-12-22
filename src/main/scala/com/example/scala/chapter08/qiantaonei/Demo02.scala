package com.example.scala.chapter08.qiantaonei

/**
  * 内部类如果想要访问外部类的属性，可以通过外部类对象访问。
  * 即：访问方式：外部类名.this.属性名
  *
  *
  */
object Demo02 {

}

class ScalaOuterClass1 {
  var name: String = "scott"
  private var sal: Double = 1.2

  class ScalaInnerClass1 { //成员内部类
    def info() = {
      // 访问方式：外部类名.this.属性名
      // 怎么理解 ScalaOuterClass.this 就相当于是 ScalaOuterClass 这个外部类的一个实例,
      // 然后通过 ScalaOuterClass.this 实例对象去访问 name 属性
      // 只是这种写法比较特别，学习java的同学可能更容易理解 ScalaOuterClass.class 的写法.
      println("name = " + ScalaOuterClass1.this.name
        + " age =" + ScalaOuterClass1.this.sal)
    }
  }

}

