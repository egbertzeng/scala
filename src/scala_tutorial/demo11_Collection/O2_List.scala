//package scala.scala_tutorial.demo11_Collection
//
///**
// * Created by liguohua on 2015/3/1.
// */
//
//object O2_List {
//  def main(args: Array[String]) {
//    test07()
//  }
//
//  def test4(): Unit = {
//    val ls = List(5, 7, 9, 12, 8, 2, 76)
//    ls match {
//      case l: List[Int] => println("right list")
//      case _ => println("error")
//    }
//  }
//
//  def test3(): Unit = {
//    //创建一个List集合对象
//    val ls = List(5, 7, 9, 12, 8, 2, 76)
//    //遍历List集合进行取值,使用
//    val it = ls.iterator
//    while (it.hasNext) {
//      print(it.next() + "\t")
//    }
//  }
//
//  def test2(): Unit = {
//    //创建一个List集合对象,其原型可以理解为List(e:Any*)
//    val ls = List(5, 7, 9, 12, 8, 2, 76)
//    //遍历List集合进行取值,集合的下标[0.ls.size-1)
//    for (i <- 0 until (ls.size)) {
//      print(ls(i) + "\t")
//    }
//  }
//
//  def test1(): Unit = {
//    //创建一个List集合对象
//    val ls = List(5)
//    //集合的大小为1
//    println(ls.size)
//    //0号下标对应的元素是5
//    println(ls(0))
//    //集合中的元素不可变，因为实质是scala.collection.immutable.List
//    //ls(0)=16//错误，集合中的元素都是不可变的
//  }
//
//  def test00(): Unit = {
//    // List of Strings
//    val fruit: List[String] = List("apples", "oranges", "pears")
//    // List of Integers
//    val nums: List[Int] = List(1, 2, 3, 4)
//    // Empty List.
//    val empty: List[Nothing] = List()
//    // Two dimensional list
//    val dim: List[List[Int]] = List(List(1, 0, 0), List(0, 1, 0), List(0, 0, 1))
//  }
//
//  def tes01(): Unit = {
//    // List of Strings
//    val fruit = "apples" :: ("oranges" :: ("pears" :: Nil))
//    // List of Integers
//    val nums = 1 :: (2 :: (3 :: (4 :: Nil)))
//    // Empty List.
//    val empty = Nil
//    // Two dimensional list
//    val dim = (1 :: (0 :: (0 :: Nil))) :: (0 :: (1 :: (0 :: Nil))) :: (0 :: (0 :: (1 :: Nil))) :: Nil
//  }
//
//  def test02(): Unit = {
//    val fruit: List[String] = List("apples", "oranges", "pears")
//    //第一个元素
//    println(fruit.head)
//    //除第一个元素外所有元素
//    println(fruit.tail)
//    //判断是否为空
//    println(fruit.isEmpty)
//  }
//
//  def test03(): Unit = {
//    val fruit: List[String] = List("apples", "oranges", "pears")
//    val people: List[String] = List("zhangsan", "lisi", "wangwu")
//    val nickNames: List[String] = List("qingfengxia", "zhizhuxia", "gangtiexia")
//
//    //1.两集合拼接,产生新的集合
//    val l1 = people.:::(nickNames)
//    println("l1=" + l1)
//
//    //2.多集合拼接,产生新的集合(元素的拼接)
//    val l2 = people ::: nickNames ::: fruit
//    println("l2=" + l2)
//    //3.多集合拼接,产生新的集合(集合的拼接)
//    val l3 = List(people, nickNames, fruit)
//    println("l3=" + l3)
//    //4.原来集合不发生变化
//    println(people)
//    println(nickNames)
//    println(fruit)
//  }
//
//  def test04(): Unit = {
//    val l1 = List(5, 7, 4, 2, 6, 9)
//    //1.list由head（元素）和tail(List)组成
//    println("list=" + l1 + "   head:" + l1.head + " tail:" + l1.tail)
//    //2.因tail是list因此也可以使用head和tail操作(正数第二)
//    println(l1.tail.head)
//
//    //3.list由init（List）和last(元素)组成
//    println("list=" + l1 + "   init:" + l1.init + " tail:" + l1.last)
//    //2.因init是list因此也可以使用init和last操作（倒数第二）
//    println(l1.init.last)
//  }
//
//  def test05(): Unit = {
//    val l1 = List(5, 7, 4, 2, 6, 9)
//    //取前2个元素封装的list.结果为List(5, 7)
//    println(l1.take(2))
//    //取后2个元素封装的list.结果为List(6, 9)
//    println(l1.takeRight(2))
//    //取满足条件的元素封装的list.结果为List(5, 7)
//    println(l1.takeWhile(_ > 4))
//    //删前2个元素,结果为List(4, 2, 6, 9)
//    println(l1.drop(2))
//    //删后2个元素,结果为List(5, 7, 4, 2)
//    println(l1.dropRight(2))
//    //??.结果为List(4, 2, 6, 9)
//    println("?? " + l1.dropWhile(_ > 4))
//    //拆分list，前2个元素为一组，其他为一组,(List(5, 7),List(4, 2, 6, 9))
//    println(l1.splitAt(2))
//    //两种apply(index),可以直接访问元素,结果是5
//    println(l1.apply(0))
//    println(l1(0))
//    //取出list的索引,结果Range(0, 1, 2, 3, 4, 5)
//    println(l1.indices)
//    //按条件分区list，partition(分区条件)，结果(List(4, 2, 6),List(5, 7, 9))
//    println(l1.partition(_ % 2 == 0))
//    //按条件划分list，span(条件)，结果(List(5, 7),List(4, 2, 6, 9))
//    println(l1.span(_ > 4))
//    //找出第一个满足条件的元素：结果：Some(4)
//    println(l1.find(_ % 2 == 0))
//    //判定是否有满足条件的元素：结果：true
//    println(l1.exists(_ % 2 == 0))
//    //判定每个元素是否满足条件：结果：false
//    println(l1.forall(_ % 2 == 0))
//    //list上的排序（从大到小）,产生新的list，原list并不会发生任何改变
//    println(l1.sortWith(_ > _))
//    println(l1)
//    //list上的排序（从小到小）,产生新的list，原list并不会发生任何改变
//    println(l1.sortWith(_ < _))
//    println(l1)
//  }
//
//  def test06(): Unit = {
//    //List()
//    var l1 = List(3, 2, 4, 5)
//    println(l1)
//    //apply()
//    l1 = List.apply(3, 2, 4, 5)
//    println(l1)
//    //make(个数，数字)
//    l1 = List.make(4, 23)
//    println(l1)
//    //range（[1-5)）
//    l1 = List.range(1, 5)
//    println(l1)
//    //range（[1-5),step）
//    l1 = List.range(1, 5, 2)
//    println(l1)
//  }
//
//  def test07(): Unit = {
//    val s1 = List("zhang", "li", "zhao", "huang")
//    val a1 = List(13, 12, 14, 15)
//    //拉拉链操作
//    val r1 = s1.zip(a1)
//    println(r1) //List((zhang,13), (li,12), (zhao,14), (huang,15))
//    val r2 = a1.zip(s1)
//    println(r2) //List((13,zhang), (12,li), (14,zhao), (15,huang))
//    //解拉链操作
//    println(r1.unzip) //(List(zhang, li, zhao, huang),List(13, 12, 14, 15))
//    println(r2.unzip) //(List(13, 12, 14, 15),List(zhang, li, zhao, huang))
//    //和自己的index配对,结果List((zhang,0), (li,1), (zhao,2), (huang,3))
//    println(s1.zipWithIndex)
//
//    //拼接集合
//    println(List(List(3, 5), List("a", "b"), List("h", "k")).flatten) //List(3, 5, a, b, h, k)
//    println(List.concat(List(3, 5), List("a", "b"), List("h", "k"))) //List(3, 5, a, b, h, k)
//    //map
//    val l3 = List(3, 2, 4, 5)
//    println(l3.map(_ * 2)) //List(6, 4, 8, 10)
//    //flatMap
//    val l4 = List(List(3, 2), List(4, 5))
//    println(l4.flatMap(_.map(_ * 2)))//List(6, 4, 8, 10)
//    //map2
//    val r3 =List.map2(List(3, 2),List(3, 2))(_+_)
//    println(r3)//List(6, 4)
//
//  }
//
//
//}
