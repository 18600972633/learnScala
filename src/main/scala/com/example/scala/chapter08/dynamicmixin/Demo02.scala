package com.example.scala.chapter08.dynamicmixin

/**
  *
  * 在特质中重写抽象方法
  * *
  * 理解 abstract override 的小技巧分享：可以这里理解，当我们给某个方法增加了abstract override 后，
  * 就是明确的告诉编译器，该方法确实是重写了父特质的抽象方法，但是重写后，该方法仍然是一个抽象方法
  * （因为没有完全的实现，需要其它特质继续实现[通过混入顺序]）
  *
  *
  *
  */
object Demo02 {

  def main(args: Array[String]): Unit = {

    // 在 xx 中调用了 super , 此时并不会调用的  x 中的方法 , 而是向左边查找 发现 Z 中具有相同方法 , 便进行了调用
    val y = new Y with Z with XX
    y.say(100)

    //    xx say
    //      z say


  }


}


trait X {
  def say(id: Int)
}

class Y {

}

trait Z extends X {

  override def say(id: Int): Unit = {
    println("z say")
  }
}

trait XX extends X {

  abstract override def say(id: Int): Unit = {
    println("xx say")
    super.say(id) // 在动态混入时 , 此时可能不是调用 X 的方法 , 此时就有用处了
  }

}
