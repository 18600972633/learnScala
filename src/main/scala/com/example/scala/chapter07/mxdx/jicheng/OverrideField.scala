package com.example.scala.chapter07.mxdx.jicheng

/**
  *
  * 字段 override
  *
  * 基本介绍
  * 在Scala中，子类改写父类的字段，我们称为覆写/重写字段。覆写字段需使用 override修饰。
  * *
  * 回顾：在Java中只有方法的重写，没有属性/字段的重写，准确的讲，是隐藏字段代替了重写。
  * ===> Java 中没有属性复写
  *
  */

/**
  * java 动态绑定机制
  * 如果调用方法 , 调用的是具体哪个是和对象的堆内存地址动态绑定
  * 如果调用属性 , 则没有动态绑定
  *
  */

/**
  * scala  中字段复写 , 复写字段必须加 override 修饰
  * 1. var 修饰的变量不能被复写
  * 2. 复写之后以子类值为准
  */

/**
  * 覆写字段的注意事项和细节
  * def只能重写另一个def(即：方法只能重写另一个方法)
  * val只能重写另一个val 属性 或 重写不带参数的def
  */

/**
  * 字段重写的情形2
  * 抽象类里面的 抽象字段 可以被重写
  *
  */

/**
  * 抽象属性：声明未初始化的变量就是抽象的属性,抽象属性在抽象类
  * var重写抽象的var属性小结
  * *
  * 一个属性没有初始化，那么这个属性就是抽象属性
  * 抽象属性在编译成字节码文件时，属性并不会声明，但是会自动生成抽象方法，所以类必须声明为抽象类
  * 如果是覆写一个父类的抽象属性，那么override 关键字可省略 [原因：父类的抽象属性，生成的是抽象方法，因此就不涉及到方法重写的概念，因此override可省略]
  *
  */
object OverrideField {

  def main(args: Array[String]): Unit = {
    val b = new B
    println(b.name)
    println(b.age)
  }

}

abstract class A {
  val name: String = "aa"

  // 抽象类里面的 抽象字段 可以被重写
  val age: Int
}

class B extends A {
  override val name: String = "bb"

  override val age = 20
}
