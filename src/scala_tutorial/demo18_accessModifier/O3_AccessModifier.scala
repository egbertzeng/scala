package scala_tutorial.demo18_accessModifier

/**
 * Created by liguohua on 2015/8/2.
 */
class Pig {
  //默认private[Pig]
  private var  name1 = "kitty"
  //Pig类私有
  private[Pig] var  name2 = "citty"
  //Pig实例私有
  private[this] var  name3 = "litty"

}

object Pig {
  /*
  一、类访问伴生对象中的成员
  */
  val n1= new Pig().name1//ok
  val n2= new Pig().name2//ok
  //val n3= new Pig().name3//error,权限不足
}
object O3_AccessModifier {

}
