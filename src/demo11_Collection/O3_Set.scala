package demo11_Collection

/**
 * Created by liguohua on 2015/3/1.
 */

object O3_Set {
  def main(args: Array[String]) {
    test3()
  }

  def test3(): Unit = {
    val st = Set(3, 5, 7, 89)
    st match {
      case s: Set[Int] => println("right Set")
      case _ => println("error")
    }
  }

  def test2(): Unit = {
    //创建一个Set集合对象,其原型可以理解为Set(e:Any*)
    val st = Set(3, 5, 7, 89)
    //遍历Set集合进行取值
    val it = st.iterator
    while (it.hasNext) {
      print(it.next() + "\t")
    }
  }

  def test1(): Unit = {
    //创建一个Set集合对象
    val st = Set(3)
    //Set集合对象的大小为1
    println(st.size)
    //Set集合的第一个值为3
    println(st.head)
    //Set集合不能用下标进行取值
    //println(st(0))//false
    // Set集合中的元素不可以改变，scala.collection.immutable.Set
    //st.head=8//错误，Set集合中的元素不可以改变
  }
}
