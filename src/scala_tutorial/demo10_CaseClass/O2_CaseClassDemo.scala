package scala_tutorial.demo10_CaseClass

/**
 * Created by liguohua on 8/5/2015.
 */
/**
 * 1.case class可以继承其他类
 * 2.case class 中默认重写了tostring和apply和unapply和copy方法
 * 3.case object可以继承其他类，它是一个无属性的单例对象
 */
abstract class Animal2

//case class都有伴生对象，可以使用伴生对象的apply()方法创建对象
case class Dog(age: Int, name: String) extends Animal2

//case object
case object Shared extends Animal2

object O2_CaseClassDemo {
  def main(args: Array[String]) {
    //这里调研了Dog.apply()
    test(Dog(2, "wangcai"))
    test(Shared)

    //copy()方法的使用
    val d2 = Dog(3, "xiaoqiang")
    //直接复制一个对象
    val d3=d2.copy()
    println("d3="+d3)
    //直接复制一个对象(改变其属性)
    val d4=d2.copy(age = 4)
    println("d4="+d4)
  }

  def test(animal2: Animal2) = animal2 match {
    //此时将调用Dog.unapply()，提取对象的内容
    case Dog(a, n) => println("Dog age=" + a + " ,name=" + n)
    case Shared => println("没有属性")
    case _ => println("不认识的类型")
  }

}
