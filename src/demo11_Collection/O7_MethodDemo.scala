package demo11_Collection

/**
 * Created by liguohua on 2015/3/1.
 */
object O7_MethodDemo {
  def main(args: Array[String]) {
    test8
  }

  def test8(): Unit = {
    //1到100之和：列表.foldLeft(初始元素)(操作函数)
    val r1 = (1 to 100).foldLeft(0)(_ + _)
    println(r1)
    //foldLeft的简写
    val r2 = (0 /: (1 to 100))(_ + _)
    println(r2)
    //1到100之和：列表.foldRight(初始元素)(操作函数)
    val r3 = (1 to 100).foldRight(0)(_ + _)
    println(r3)
    //foldRight的简写
    val r4 = ((1 to 100) :\ 0)(_ + _)
    println(r4)
  }

  def test7: Unit = {
    val ls1 = List(List(2, 4, 3), List(2, 4, 3, 9))
    //将多个集合合并成一个集合，产生List(2, 4, 3, 2, 4, 3, 9)
    //val rs1=ls1.flatMap((l:List[Int])=>{l.map((x:Int)=>{x*2})})
    //简化map中的匿名函数
    //val rs1=ls1.flatMap((l:List[Int])=>{l.map(x=>x*2)})
    // val rs1=ls1.flatMap((l:List[Int])=>{l.map(_*2)})
    //简化flatMap()中的匿名函数
    //val rs1=ls1.flatMap(l=>l.map(_*2))
    //第一个_表示ls1中的每一个List。第二个_表示s1中的每一个List中的每一个元素
    val rs1 = ls1.flatMap(_.map(_ * 2))
    println(rs1)
  }

  def test6: Unit = {
    val ls1 = List(List(2, 4, 3), List(2, 4, 3, 9))
    //将多个集合合并成一个集合，产生List(2, 4, 3, 2, 4, 3, 9)
    val rs1 = ls1.flatten
    println(rs1)
    val ls2 = List(List(2, 4), List(List(2, 4), List(3, 9)))
    //将多个集合合并成一个集合，产生List(2, 4, List(2, 4), List(3, 9))
    val rs2 = ls2.flatten
    println(rs2)
  }

  def test5: Unit = {
    val ls = List(2, 4, 3, 9, 45, 109)
    //将一个集合分割成多个集合，产生(List(2, 4),List(3, 9, 45, 109))
    val rs = ls.partition(_ % 2 == 0)
    println(rs)
    println(rs._1 + "\t" + rs._2)

  }

  def test4: Unit = {
    val ls1 = List(2, 4, 3, 9)
    val ls2 = List("zhang", "li", "wang")
    //以ls1为基准进行组合，产生List((2,zhang), (4,li), (3,wang))
    val rs1 = ls1.zip(ls2)
    println(rs1)
    //以ls2为基准进行组合，产生List((zhang,2), (li,4), (wang,3))
    val rs2 = ls2.zip(ls1)
    println(rs2)

  }

  def test3: Unit = {
    val ls = List(2, 4, 3, 45, 109)
    //filter是为了过滤符合条件的元素，
    //val rs = ls.filter((x:Int)=>{x%2!=0})
    //函数体只有一句，{}可以省略
    //val rs = ls.filter((x: Int) => x % 2 != 0)
    //参数只有一个，类型可以省略
    //val rs = ls.filter((x) => x % 2 != 0)
    //参数只有一个，()可以省略
    //val rs = ls.filter(x => x % 2 != 0)
    //参数只有一个，使用通配符
    val rs = ls.filter(_ % 2 != 0)
    //List中的元素是不可变的
    println(ls)
    //将产生一个新的List
    println(rs)
  }

  def test2: Unit = {
    val ls = List(2, 4, 3, 45, 109)
    //map类似于foreach，不同的在于它有返回值，
    //val rs = ls.map((x:Int)=>x * 2)
    //var rs = ls.map(x => x * 2)
    val rs = ls.map(_ * 2)
    //List中的元素是不可变的
    println(ls)
    //将产生一个新的List
    println(rs)
  }

  def test1: Unit = {
    val ls = List(2, 4, 3, 45, 109)
    //var rs=ls.foreach((x:Int)=>x*2)
    //var rs = ls.foreach(x => x * 2)
    var rs = ls.foreach(_ * 2)
    //List中的元素是不可变的
    println(ls)
    //foreach不会参数返回值
    println(rs)
  }
}
