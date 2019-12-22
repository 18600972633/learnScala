package com.example.scala.chapter09.base

/**
  * 隐式转换丰富类库功能
  *
  * 在当前程序中，如果想要给MySQL类增加功能是非常简单的，但是在实际项目中，
  * 如果想要增加新的功能就会需要改变源代码，这是很难接受的。
  * 而且违背了软件开发的OCP开发原则 (闭合原则 open close priceple)   >>  即对修改封闭 对扩展是开放的
  * 在这种情况下，可以通过隐式转换函数给类动态添加功能。
  *
  *
  */
object Demo01 {

  /**
    * 定义一个隐式转换 增强 A 类的功能
    * 将 A 隐式的具备了 B 的功能
    *
    */
  implicit def enhanceA(a: A): B = {
    new B
  }

  /**
    * public final class Demo01$
    * {
    * public static final Demo01$ MODULE$;
    * *
    * static  {
    * *
    * }
    * *
    * public B enhanceA(A a) { return new B(); }
    * *
    *
    *
    * public void main(String[] args) {
    * A a = new A();
    * enhanceA(a).say();
    * }
    * *
    *
    *
    *
    *
    * private Demo01$() { MODULE$ = this; }
    * }
    *
    *
    */
  def main(args: Array[String]): Unit = {

    val a = new A
    // enhanceA(a).say();
    a.say()
    a.say()

  }

}


class A {

}

class B {
  println("b init")

  def say(): Unit = {
    println(" b say ")
  }
}

































































