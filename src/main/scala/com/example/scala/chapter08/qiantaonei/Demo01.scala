package com.example.scala.chapter08.qiantaonei

/**
  * 在Scala中，你几乎可以在任何语法结构中内嵌任何语法结构。
  * 如在类中可以再定义一个类，这样的类是嵌套类，其他语法结构也是一样。
  * 嵌套类类似于Java中的内部类。
  *
  *
  */
object Demo01 {

  def main(args: Array[String]): Unit = {

    val outer1 : ScalaOuterClass = new ScalaOuterClass()
    val outer2 : ScalaOuterClass = new ScalaOuterClass()

    // Scala创建内部类的方式和Java不一样，将new关键字放置在前，使用  对象.内部类  的方式创建
    val inner1 = new outer1.ScalaInnerClass()
    val inner2 = new outer2.ScalaInnerClass()
    //创建静态内部类对象
    val staticInner = new ScalaOuterClass.ScalaStaticInnerClass()
    println(staticInner)



  }

}


class ScalaOuterClass {

  class ScalaInnerClass { //成员内部类
  }

}

object ScalaOuterClass { //伴生对象
class ScalaStaticInnerClass { //静态内部类
}

}

