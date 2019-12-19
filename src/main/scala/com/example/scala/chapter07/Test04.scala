package com.example.scala.chapter07

/**
  * 包对象和子包的名称是一一对应的
  * 包对象中定义的变量 方法可以在包中使用 ; 相当于定义了一个包下的一些共有的东西
  *
  */

//  package object p01   ======    package p01


/**
  *
  * 包对象底层原理
  * 包对象会生成两个文件  :  package.class    package$.class
  *
  */


package object p01 {
  val CODE = "1101229443"

  def getCode(): String = {
    CODE
  }

}

package p01 {

  object Test {
    def main(args: Array[String]): Unit = {
      println(getCode())
    }
  }

}
