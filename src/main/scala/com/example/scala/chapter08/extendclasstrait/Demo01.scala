package com.example.scala.chapter08.extendclasstrait

/**
  * 扩展类的特征
  *
  * 特质可以继承类，以用来拓展该类的一些功能
  *
  * 所有混入该特质的类，会自动成为那个特质所继承的超类的子类
  */

// 如果混入该特质的类，已经继承了另一个类(A类)，则要求A类是特质超类的子类，
// 否则就会出现了多继承现象，发生错误。
// 本质原因是因为 java 不支持多继承


object Demo01 {

}

trait LoggerException extends Exception {

  def log(): Unit = {
    println(getMessage)
  }

}
