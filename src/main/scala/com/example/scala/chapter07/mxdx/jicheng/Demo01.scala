package com.example.scala.chapter07.mxdx.jicheng


/**
  * 继承
  *
  * 子类继承了父类所有的属性 , 只是父类私有的属性访问不到
  *
  */
/**
  * 继承层级
  * *
  * 继承层级图小结
  * 在scala中，所有其他类都是AnyRef的子类，类似Java的Object。
  * AnyVal和AnyRef都扩展自Any类。Any类是根节点
  * Any中定义了isInstanceOf、asInstanceOf方法，以及哈希方法等。
  * *
  * Null类型的唯一实例就是null对象。可以将null赋值给任何引用，但不能赋值给值类型的变量[案例演示]。
  * Nothing类型没有实例。它对于泛型结构是有用处的，举例：空列表Nil的类型是List[Nothing]，它是List[T]的子类型，T可以是任何类。
  *
  */
object Demo01 {

  def main(args: Array[String]): Unit = {
    val s = new Student
    s.name = "jack"
    s.say()
    s.study()
  }

}


class Person {

  var name: String = _
  var age: Int = _

  def say(): Unit = {
    println(s"name = $name")
  }

}

class Student extends Person {

  def study(): Unit = {
    println(s" $name like study ....")
  }

}
