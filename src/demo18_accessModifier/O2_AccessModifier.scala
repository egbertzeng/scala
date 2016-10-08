package demo18_accessModifier

/**
 * Created by liguohua on 2015/8/2.
 */

class Cat {
  /*
  一、类访问伴生对象中的成员
  */
  val n1=Cat.name1//ok
  val n2=Cat.name2//ok
  //val n3=Cat.name3//error,权限不足
}

object Cat {
  //默认private[Cat]
  private var  name1 = "kitty"
  //Cat类私有
  private[Cat] var  name2 = "citty"
  //Cat对象私有
  private[this] var  name3 = "litty"
}

object O2_AccessModifier {
  def main(args: Array[String]) {

  }
}
