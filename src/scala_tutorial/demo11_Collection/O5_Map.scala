package scala_tutorial.demo11_Collection

/**
 * Created by liguohua on 2015/3/1.
 */


object O5_Map {
  def main(args: Array[String]) {
    test6()
  }

  def test6(): Unit = {
    var mp1 = Map("stu1" -> "zhangsan", "stu2" -> "lisi", "stu5" -> "wangwu")
    //调换k和v(产生新的map)
    val mp2 = for ((k, v) <- mp1) yield (v, k)
    //遍历map1
    println()
    for ((k, v) <- mp1) {
      print(k + "->" + v+"\t")
    }
    //遍历map2
    println()
    for ((k, v) <- mp2) {
      print(k + "->" + v+"\t")
    }
  }

  def test5(): Unit = {
    val mp = Map("stu1" -> "zhangsan", "stu2" -> "lisi", "stu5" -> "wangwu")
    //遍历map
    for ((k, v) <- mp) {
      println(k + "->" + v)
    }

  }

  def test4(): Unit = {
    //定义Map对象
    val mp = Map("stu1" -> "zhangsan", "stu2" -> "lisi", "stu5" -> "wangwu")
    //遍历Map
    //遍历键
    val it = mp.keysIterator
    while (it.hasNext) {
      //取出键
      val key = it.next
      //取出值
      val value = mp.get(key).getOrElse("None")
      println(key + "\t" + value)
    }

  }

  def test3(): Unit = {
    //定义Map对象
    val mp = Map("stu1" -> "zhangsan", "stu2" -> "lisi", "stu5" -> "wangwu")
    //遍历Map
    //键的集合
    val keys = mp.keySet
    //遍历键
    val it = keys.iterator
    while (it.hasNext) {
      //取出键
      val key = it.next
      //取出值
      val value = mp.get(key).getOrElse("None")
      println(key + "\t" + value)
    }

  }

  def test2(): Unit = {
    //定义Map对象,,其原型可以理解为Set(k:Any->v:Any *)
    val mp = Map("stu1" -> "zhangsan", "stu2" -> "lisi", "stu5" -> "wangwu")
    //遍历Map
    //键的集合
    val keys = mp.keys
    //遍历键
    val it = keys.iterator
    while (it.hasNext) {
      //取出键
      val key = it.next
      //取出值
      val value = mp.get(key).getOrElse("None")
      println(key + "\t" + value)
    }

  }

  def test1(): Unit = {
    //定义Map对象
    val mp = Map("stu1" -> "zhangsan")
    //Map的大小为1
    println(mp.size)
    //取出元素中的值
    println(mp.get("stu1").get)
    //为避免出现NoSuchElementException异常可以getOrElse("None")
    //println(mp.get("stu2").get)//会报异常
    println(mp.get("stu2").getOrElse("None")) //不会报异常,打印None
    //错误，不能赋值
    //mp.get("stu1").get="zhansanfei"
  }

}