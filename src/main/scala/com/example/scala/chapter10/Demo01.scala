package com.example.scala.chapter10

/**
  * 集合体系
  *
  *1.Set、Map是Java中也有的集合
  *
  *2.Seq是Java没有的，我们发现List归属到Seq了,因此这里的List就和java不是同一个概念了
  *
  *3.我们前面的for循环有一个 1 to 3 , 就是IndexedSeq 下的Vector
  *
  *4.String也是属于IndexeSeq
  *
  *5.我们发现经典的数据结构比如 Queue 和 Stack被归属到LinearSeq
  *
  *6.大家注意Scala中的Map体系有一个 SortedMap,说明Scala的Map可以支持排序
  *
  *7.IndexSeq 和 LinearSeq 的区别 [IndexSeq是通过索引来查找和定位，因此速度快，比如String就是一个索引集合，通过索引即可定位]
  * [LineaSeq 是线型的，即有头尾的概念，
  * 这种数据结构一般是通过遍历来查找，它的价值在于应用到一些具体的应用场景 (电商网站, 大数据
  * 推荐系统 :最近浏览的10个商品)
  *
  *
  */
object Demo01 {

}
