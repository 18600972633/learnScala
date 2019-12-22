package com.example.scala.chapter09.yingshinei

/**
  * 隐式类
  *
  * 在scala2.10后提供了隐式类，可以使用implicit声明类，隐式类的非常强大，
  * 同样可以扩展类的功能，比前面使用隐式转换丰富类库功能更加的方便，在集合中隐式类会发挥重要的作用。
  *
  * 隐式类使用有如下几个特点：
  * 其所带的构造参数 有且只能 有一个
  * 隐式类必须被定义在“类”或“伴生对象”或“包对象”里，即隐式类不能是 顶级的(top-level  objects)。
  * 隐式类不能是case class（case class在后续介绍 样例类）
  * 作用域内不能有与之相同名称的标识符
  *
  *
  *
  */
object Demo1 {

  // 定义一个隐式类
  implicit class B(a: A) {
    println("b init..")

    def say(): Unit = {
      println("b say bbbbb")
    }

  }

  def main(args: Array[String]): Unit = {

    val a = new A

    // a 隐式的转换成  B 对象
    a.say()
    a.say()

  }

}


class A {

}
