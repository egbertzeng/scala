//package scala.scala_tutorial.demo17_package
//
///**
// * Created by liguohua on 2015/8/2.
// */
//package object hadoopp {
//  //数据
//  var name = "hadoopp"
//  //方法
//  def fun1(): Unit = {
//    println("package object " + this.name)
//  }
//}
//
////包对象（包的伴生对象）（相当于类的伴生对象）
//object O2_PackageDemo {
//  def main(args: Array[String]) {
//    //1.测试数据和方法的可用性
//    val h1 = new hadoopp.HaddoopComm()
//    h1.testData()
//    h1.testFun()
//    //2.测试数据和方法的共享性（包对象的方法只有一份，实例共享）
//    h1.testChangeData("xxxxx")
//    h1.testData()
//    h1.testFun()
//    val h2 = new hadoopp.HaddoopComm()
//    h2.testData()
//    h2.testFun()
//  }
//}
//
////包中类
//class HaddoopComm {
//  //类中方法
//  def testData(): Unit = {
//    //使用包对象的数据
//    println("package testData() name=" + name)
//  }
//
//  //类中方法
//  def testFun(): Unit = {
//    println("package testFun()")
//    //使用包对象的方法
//    fun1()
//  }
//  def testChangeData(n: String): Unit ={
//    name = n
//  }
//}
