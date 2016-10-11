package scala_tutorial.demo11_Collection

import scala.collection.mutable.ArrayBuffer

/**
 * Created by liguohua on 2015/3/1.
 */

object O1_Array {
  def main(args: Array[String]) {
    test5()
  }
  def test11(): Unit = {
    val arr = ArrayBuffer(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
    //数组上的基本的算术运算
    println(arr.sum)
    println(arr.min)
    println(arr.max)
    //统计偶数的个数
    println(arr.count(_ % 2 == 0))
    //数组上的排序(从小到大),产生新的数组，原数组并不会发生任何改变
    val arr2 = arr.sorted
    println(arr)
    println(arr2)
    //数组上的排序（从小到小）,产生新的数组，原数组并不会发生任何改变
    println(arr.sortWith(_ < _))
    //数组上的排序（从大到小）,产生新的数组，原数组并不会发生任何改变
    println(arr.sortWith(_ > _))
    //数组上的创造字符串，-为元素的连接符号
    println(arr.mkString("-"))
    //数组上的创造字符串，"<<"表示前缀,"-"表示连接符号,">>"表示后缀
    println(arr.mkString("<<", "-", ">>"))
  }
  def test10(): Unit = {
    //定义一个长度为0的变长数组,，可以理解为java中的ArrayList
    val b = new ArrayBuffer[Int]()
    println(b)
    //在b的结尾追加元素2
    b += 2
    println(b)
    //在b的结尾追加一组元素
    b +=(3, 4, 5, 6, 7, 8)
    println(b)
    //利用++=可以添加任意类型的集合
    b ++= Array(3, 4, 2)
    println(b)
    //删除结尾两个元素
    b.trimEnd(2)
    println(b)
    //删除开始两个元素
    b.trimStart(2)
    println(b)
    //在下标2处插入元素0 (没有首尾高效)
    b.insert(2, 0)
    println(b)
    //在下标2处插入元素1,4,7
    //insert(n : scala.Int, elems : A*)
    b.insert(2, 1, 4, 7)
    println(b)
    //在下标2处删除3个元素
    b.remove(2, 3)
    println(b)
    //删除下标为2的元素
    b.remove(2)
    println(b)
    //将变长数组转换为定长数组
    val arr = b.toArray
    println(arr.getClass)
    //将定长数组转换为变长数组
    val c = arr.toBuffer
    println(c)

  }
  def test9(): Unit = {

    //1.定义一个3行3列的二维数组
    import scala.Array._
    val myMatrix = ofDim[Int](3, 3)
    //2.二维数组赋值
    for (i <- 0 to 2) {
      for (j <- 0 to 2) {
        myMatrix(i)(j) = j * i
      }
    }
    //3.二维数组取值
    for (i <- 0 to 2) {
      for (j <- 0 to 2) {
        print(" " + myMatrix(i)(j))
      }
      println()
    }
  }
  def test8(): Unit = {
    val arr = new Array[Int](12)
    arr match {
      case a: Array[Int] => println("right")
      case _ => println("error")
    }
  }
  def test5(): Unit ={
    val arr = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
    //1.map(数据转换函数)
    val arr2=arr.map(_*2)
    for (e<-arr2){
      print(e)
    }
    println()
    //2.filter(返回bool类型的函数)
    val arr3=arr.filter(x=>(x%2)!=0)
    for (e<-arr3){
      print(e)
    }
    println()
    //3.几个基本函数
    val max=arr.max
    println("max="+max)
    val min=arr.min
    println("min="+min)
    //4.sorted排序，默认升序
    val arr4=arr.sorted
    for (e<-arr4){
      print(e)
    }
    println()
    //5.使用工具类对数组进行快速排序（改变原有数组）
    scala.util.Sorting.quickSort(arr)
    for (e<-arr){
      print(e)
    }
    println()
    //6.zip操作(拉链操作)
    val s = Array("zhangsan","lisi","wangwu")
    val a = Array(18,20,19)
    val sa = s.zip(a)
    for (e<-sa){
      print(e)
    }
    println()


  }
  def test4(): Unit = {
    val arr = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)


    //遍历数组,数组的下标[0,arr.length-1)
    for (i <- 0 until arr.length) {
      print(arr(i) + "\t")
    }
    println()
    //遍历数组,倒序
    for (i <- 0 until arr.length reverse) {
      print(arr(i) + "\t")
    }
    println()
    //遍历数组,增量为2
    for (i <- 0 until(arr.length, 2)) {
      print(arr(i) + "\t")
    }
    println()
    //遍历数组,直接使用元素，不用下标
    for (e <- arr) {
      print(e + "\t")
    }
    println()
  }
  def test3(): Unit ={
  //1. 建数组的第二种方式
  var myList1 = Array(1.9, 2.9, 3.4, 3.5)
  for (i <- myList1) {
    print(i)
  }
  //2.创建数组的第三种方式
  import scala.Array._
  //[10,20）步长度为2
  var myList2 = range(10, 20, 2)
  //[10,20）步长度为1
  var myList3 = range(10, 20)
  for (x <- myList1) {
    print(" " + x)
  }
  println()
  for (x <- myList2) {
    print(" " + x)
  }
}
  def test2(): Unit = {
    val arr = new Array[Int](12)
    //遍历数组进行赋值操作
    for (i <- 0 until arr.length) {
      arr(i) = (i * i)
    }
    //遍历数组进行取值操作
    for (i <- 0 until arr.length) {
      //打印数组中的每一个元素
      print(arr(i) + "\t")
    }
  }

  def test1(): Unit = {
    //创建一个长度为12的数组
    val arr = new Array[Int](12)
    //打印数组的长度
    println(arr.length)
    //遍历数组,数组的下标[0,arr.length-1)
    for (i <- 0 until arr.length) {
      //打印数组中的每一个元素
      print(arr(i) + "\t")
    }
  }
}

