package scala_tutorial.demo15_Regex

import scala.util.matching.Regex
/**
 * Created by liguohua on 2015/3/31.
 */
class O1_RegexDemo {

}

object O1_RegexDemo {
  def main(args: Array[String]) {
    //test1()
    test4()
  }

  def test4(): Unit ={
    val pattern = new Regex("abl[ae][\\d|\\w]+")
    val str = "ablaw is able3 and cool ableex"
    println((pattern findAllIn str).mkString(","))
  }
  def test3() {
    //字符串
    val str = "Scala is Scalable and cool , i love scala programming language"
    //正则表达式
    val regex=new Regex("(S|s)cala")
    //正则作用于字符串
    val rs= regex.findAllIn(str).mkString(",")
    println(rs)
  }

  def test2() {
    //字符串
    val str = "Scala is Scalable and cool , i love scala programming language"
    //正则表达式
    val regex=new Regex("scala")
    //正则作用于字符串
    val rs= regex.findFirstIn(str)
    println(rs)
  }
  def test1() {
    //字符串
    val str = "Scala is Scalable and cool , i love scala programming language"
    //正则表达式
    val regex="scala".r()
    //正则作用于字符串
    val rs= regex.findFirstIn(str)
    println(rs)
  }
}
