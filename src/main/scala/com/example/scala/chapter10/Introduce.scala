package com.example.scala.chapter10

/**
  * scala集合基本介绍
  *
  * Scala同时支持不可变集合和可变集合，不可变集合可以安全的并发访问
  *
  * 两个主要的包：
  * 不可变集合：scala.collection.immutable
  * 可变集合：  scala.collection.mutable
  * Scala默认采用不可变集合，对于几乎所有的集合类，Scala都同时提供了可变(mutable)和不可变(immutable)的版本
  * Scala的集合有三大类：序列Seq、集Set、映射Map，所有的集合都扩展自Iterable特质，在Scala中集合有可变（mutable）和不可变（immutable）两种类型。
  *
  *
  */

/**
  * 可变集合和不可变集合举例
  * *
  * 不可变集合：scala不可变集合，就是这个集合本身不能动态变化。(类似java的数组，是不可以动态增长的)   (堆地址大小不可变)
  * 可变集合:可变集合，就是这个集合本身可以动态变化的。(比如:ArrayList , 是可以动态增长的)           (堆地址大小可变)
  *
  */

trait Introduce {
}
