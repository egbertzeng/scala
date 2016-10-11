package scala_tutorial.demo11_Collection

/**
 * Created by liguohua on 2015/3/1.
 */
object O6_Foreach {
  def main(args: Array[String]) {
    test4
    test3
    test2
    test1
  }
  def test4: Unit = {
    val ls = List(2, 4, 3, 45, 109)
    //使用通配符更简单
    ls.foreach(print(_))
  }

  def test3: Unit = {
    val ls = List(2, 4, 3, 45, 109)
    //只有一个参数的匿名函数：x=>print(x+"\t")
    ls.foreach(x => print(x + "\t"))
  }

  def test2: Unit = {
    val ls = List(2, 4, 3, 45, 109)
    //写成匿名函数：(x:Int)=>print(x+"\t")
    ls.foreach((x: Int) => print(x + "\t"))
  }

  def test1: Unit = {
    val ls = List(2, 4, 3, 45, 109)
    //foreach是高阶函数，因为它函数中可以嵌套函数
    ls.foreach(add(_))
  }

  def add(x: Int): Unit = {
    print(x + "\t")
  }

}