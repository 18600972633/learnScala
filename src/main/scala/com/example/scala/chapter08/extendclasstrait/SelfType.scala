package com.example.scala.chapter08.extendclasstrait

/**
  * 自身类型：主要是为了解决特质的循环依赖问题，
  * 同时可以确保特质在不扩展某个类的情况下，依然可以做到限制混入该特质的类的类型。
  *
  */
object SelfType {

}


trait Logger {

  // 限制混入该特质的类的类型 。
  // 混入 Logger 的类 必须是 Exception 的子类
  this: Exception =>

  def log(): Unit = {
    println(getMessage)
  }


}
