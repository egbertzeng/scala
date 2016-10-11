//package scala.scala_tutorial.demo11_Collection
//
///**
// * Created by liguohua on 2015/7/31.
// */
//object O8_Match {
//
//  def main (args: Array[String]) {
//    //1.基本类型的match
//    matchType(10)
//    matchType("ketty")
//    matchType(Map("zhangsan"->18,"lisi"->25))
//    //2.数组类型的match
//    matchArray(Array(20))
//    matchArray(Array(34))
//    matchArray(Array("zhang","li"))
//    matchArray(Array(2,122,122,122))
//    //3.List类型的match
//    matchList(List(20))
//    matchList(List(25))
//    matchList(List("zhang","li"))
//    matchList(List(222,123,123,123))
//    //4.Tuple类型的match
//    matchTuple(("zhangsan",18,"山东"))
//    matchTuple(("li",20,"山东"))
//  }
//  def matchType(i:Any): Unit ={
//      i match {
//        case p:Int=>println(p+" is Int")
//        case p:String=>{println(p+" is string")}
//        case m:Map[String,_]=>{m.foreach(println)}
//        case _=>println("i don't konw!")
//      }
//  }
//  def matchArray(arr:Array[Any]) = arr match {
//    case Array(20)=>println("数组中有且只有一个元素20")
//    case Array(x)=>println("数组中有且只有一个元素: x="+arr(0))
//    case Array(x,y)=>println("数组中有且只有两个元素:x="+arr(0)+" , y="+arr(1))
//    case Array(29,_*)=>println("数组中第一个元素是29,其他元素个数不限")
//    case _=>println("Array其他情况")
//  }
//
//  def matchList(l:List[Any]) = l match {
//    case List(20)=>println("List中有且只有一个元素20")
//    case 25::nil=>println("List中有且只有一个元素25")
//    case x::nil=>println("List中有且只有一个元素:x="+x)
//    case x::y::nil=>println("数组中有且只有两个元素:x="+x+" , y="+y)
//    case 222::tail=>println("第一个元素是222,后面的元素不限")
//    case _=>println("List其他情况")
//  }
//  def matchTuple(t:Any) = t match {
//    case ( "zhangsan" , _,_ ) => println("元组的第一个元素是：zhangsan")
//    case ( _,20,_ ) => println("元组的第二个元素是：20")
//    case _=>println("Tuple其他情况")
//  }
//}
