package scala_tutorial.demo09_Match

/**
 * Created by liguohua on 2015/3/1.
 */
class O1_MatchDemo {

}

object O1_MatchDemo {
  def main(args: Array[String]) {
    test3()
  }

  //一个小用法
  def test4(x: Int): String = x match {
    case 1 => "one"
    case 2 => "two"
    case _ => "many"
  }

  def test3(): Unit = {
    val v1 = 5
    //模式匹配中可以直接进行方法调用
    var rs = v1 match {
      case 1 => "number one"
      case 2 => "number two"
      case 3 => "number three"
      //可以直接使用语句块
      case _ => {
        println("please reinput ")
        //最后一句作为块的返回值
        "error number"
      }
    }
    println(rs)
  }

  def test2(): Unit = {
    val v1 = 5
    //模式匹配中可以直接进行方法调用
    var rs = v1 match {
      case 1 => println("number one")
      case 2 => println("number one")
      case 3 => println("number three")
      case _ => println("error number")
    }
    println(rs)
  }

  def test1(): Unit = {
    val v1 = 5
    //模式匹配有返回值,不需要break，匹配后直接返回(有返回值)
    var rs = v1 match {
      case 1 => "number one"
      case 2 => "number two"
      case 3 => "number three"
      //模式匹配中可以直接使用语句块
      case _ => "error number"
    }
    println(rs)
  }
}
