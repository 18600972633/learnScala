package com.example.scala.chapter08.traitdemo

/**
  * 特质的基础使用
  */
object Demo01 {

  def main(args: Array[String]): Unit = {
    val person = new Person("jack")
    person.play()
    person.work("software")
    println(person.say())
  }


}


class Person(nameIn: String) extends Fun with Social {

  var name: String = nameIn

  override def play(): Unit = {
    println(s"$name  play for fun ..")
  }

  override def work(job: String): Unit = {
    println(s"$name do job $job very hard ! !")
  }

  override def say(): String = {
    s"my name is $name"
  }
}

trait Fun {
  def play()

  def say(): String
}

trait Social {
  def work(job: String)
}
