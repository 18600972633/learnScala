package com.example.scala.chapter07 {

  class A {

  }

  package p1 {

    class B {

    }

  }

  package p2 {

    trait t1 {
      def say(name: String)
    }

    class C {

    }

  }

}


/**
  * 包可以嵌套 : 包中有包
  * 可以在包中创建 object class  trait  package
  */


/**
  * 子包可以直接访问父包的内容 , 不需要 import
  * 如果父包和子包有同名对象, 则采用就近原则 , 采用包全路径可以访问父包的对象
  *
  */