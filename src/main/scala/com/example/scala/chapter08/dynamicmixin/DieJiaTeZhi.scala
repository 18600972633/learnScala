package com.example.scala.chapter08.dynamicmixin

/**
  * 叠加特质
  * *
  * 基本介绍
  * 构建对象的同时如果混入多个特质，称之为叠加特质，
  * 那么特质声明顺序从左到右，方法执行顺序从右到左。
  *
  *
  *
  */
object DieJiaTeZhi {

  def main(args: Array[String]): Unit = {

    /**
      * 一个对象被动态混入多个特质时 , 构造是从左到右
      * 执行混入特质的方法时 , 是从右到左 , 如果最右侧特质有这个方法就直接执行了 。
      * 否则往左侧找到有这个特质的方法 , 进行执行
      *
      * 如果混入特质中调用了 super，并不是表示调用父特质的方法，而是向前面（左边）继续查找特质，如果找不到，才会去父特质查找
      */

    /**
      * 构造顺序  --------->
      *
      * 方法执行  <----------  如果右侧没有, 则往前查找。  如果在混入特质的方法中调用 super , 此时也是往右侧查找特质是否有同名方法 (找到了进行执行 , 找不到才调用其父类)
      *
      * 如果就是要调用具体特质的方法，可以指定：super[特质].xxx(…).  其中的泛型必须是该特质的直接超类类型
      *
      * trait File4 extends  Data4 {
      * println("File4")
      * override def insert(id : Int): Unit = {
      * print("向文件")
      * super[Data4].insert(id)
      * }}
      *
      *
      */

    val person = new Person with B1 with C1
    person.insert(1)

    //    person
    //    AA
    //    B1
    //    C1
    //    C1 insert id = 1
    //    B1 insert id = 1
    //    AA insert id = 1

  }

}

class Person {
  println("person")
}

trait A1 {
  def insert(id: Int)
}

trait AA extends A1 {
  println("AA")

  def insert(id: Int): Unit = {
    println(s"AA insert id = $id")
  }

}

trait B1 extends AA {

  println("B1")

  override def insert(id: Int): Unit = {
    println("B1 insert id = " + id)
    //    super.insert(id)
  }

}


trait C1 extends AA {

  println("C1")

  override def insert(id: Int): Unit = {
    println("C1 insert id = " + id)
    //    super.insert(id)
  }

}

































































































































