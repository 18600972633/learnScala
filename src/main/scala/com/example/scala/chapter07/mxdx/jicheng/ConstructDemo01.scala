package com.example.scala.chapter07.mxdx.jicheng

/**
  * 构造器
  *
  * 1. 类有一个主构器和任意数量的辅助构造器，而每个辅助构造器都必须先调用主构造器(也可以是间接调用.)，这点在前面我们说过了。
  *
  * 2. 只有主构造器可以调用父类的构造器  。 辅助构造器不能直接调用父类的构造器。
  *     在Scala的构造器中，你不能调用super(params)
  *   eg :  class Emp (name: String) extends Person(name)     {// 将子类参数传递给父类构造器,这种写法√
  *
  *

  */
class ConstructDemo01 {

}
