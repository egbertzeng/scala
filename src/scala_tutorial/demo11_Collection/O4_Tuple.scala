//package scala.scala_tutorial.demo11_Collection
//
///**
// * Created by liguohua on 2015/3/1.
// */
//
//
//object O4_Tuple {
//  def main(args: Array[String]) {
//    test5
//  }
//
//  def test5: Unit = {
//    //定义一个元组,key=(zhangsan,18) ,value=female
//    val stu = "zhangsan" -> 18 -> "female"
//    println(stu._1 + "\t" + stu._2)
//    println(stu._1._1 + "\t" + stu._1._2 + "\t" ++ stu._2)
//  }
//
//
//  def test4: Unit = {
//    //定义一个元组,key=zhangsan ,value=18
//    val stu = "zhangsan" -> 18
//    println(stu._1 + "\t" + stu._2)
//  }
//
//  def test3: Unit = {
//
//    val stu = ("zhangsan", 18)
//    //元组进行模式匹配
//    stu match {
//      case t: (String, Int) => println("right")
//      case t: (Int, String) => println("right")
//      case _ => println("error")
//    }
//
//  }
//
//  def test2: Unit = {
//    //定义一个元组，元组中可以嵌套元组
//    val stu1 = ("zhangsan", ("shandong", "jinan"))
//    //取出元组中的元素，元组下标从1开始
//    println(stu1._1 + "\t" + stu1._2)
//    //取出元组中的元素，元组下标从1开始
//    println(stu1._1 + "\t" + stu1._2._1 + "\t" + stu1._2._2)
//  }
//
//  def test1: Unit = {
//    //定义一个元组，元组中的数据类型是多样的
//    val stu1 = ("zhangsan", 18, "female")
//    //取出元组中的元素，元组下标从1开始
//    println(stu1._1 + "\t" + stu1._2 + "\t" + stu1._3)
//    //元组中的元素也不能被改变
//    //stu1._1="zhangsanfeng"//错误，元组中的元素也不能被改变
//  }
//}