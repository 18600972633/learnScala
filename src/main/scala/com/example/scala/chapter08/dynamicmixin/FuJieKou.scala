package com.example.scala.chapter08.dynamicmixin

/**
  * 富接口：即该特质中既有抽象方法，又有非抽象方法
  *
  *
  */

trait Operate {
  def insert(id: Int) //抽象
  def pageQuery(pageno: Int, pagesize: Int): Unit = { //实现
    println("分页查询")
  }
}


class FuJieKou {

}
