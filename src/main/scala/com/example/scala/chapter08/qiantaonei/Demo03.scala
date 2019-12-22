package com.example.scala.chapter08.qiantaonei

/**
  * 内部类如果想要访问外部类的属性，也可以通过外部类别名访问(推荐)。
  * 即：访问方式：外部类名别名.属性名   【外部类名.this  等价 外部类名别名】
  *
  */
object Demo03 {

}

class ScalaOuterClass {
  myOuter => //这样写，你可以理解成这样写，myOuter就是代表外部类的一个对象.
  class ScalaInnerClass { //成员内部类
    def info() = {
      println("name = " + ScalaOuterClass.this.name
        + " age =" + ScalaOuterClass.this.sal)
      println("-----------------------------------")
      println("name = " + myOuter.name
        + " age =" + myOuter.sal)
    }
  }

  // 当给外部指定别名时，需要将外部类的属性放到别名后.
  var name: String = "scott"
  private var sal: Double = 1.2
}

