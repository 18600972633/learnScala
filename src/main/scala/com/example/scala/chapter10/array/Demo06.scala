package com.example.scala.chapter10.array

import java.util

/**
  * Java的List 转 Scala数组(mutable.Buffer)
  */
object Demo06 {

  def main(args: Array[String]): Unit = {

    val jList = new util.ArrayList[Int]()
    jList.add(1)


    import scala.collection.JavaConversions.asScalaBuffer
    import scala.collection.mutable

    //  隐式转换  java.util.List ==> Buffer
    val scalaArr: mutable.Buffer[Int] = jList
    scalaArr.append(5)
    println(scalaArr)


  }

}
