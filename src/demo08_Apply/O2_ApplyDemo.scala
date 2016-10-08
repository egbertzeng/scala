package demo08_Apply

/**
 * Created by liguohua on 2015/3/1.
 */
class O2_ApplyDemo {

}

object O2_ApplyDemo {
  def main(args: Array[String]) {
    //创建对象的方式一
    val cat1 = new Cat
    println(cat1)
    //创建对象的方式二(需要在对象中定义apply()方法)
    val cat2 = Cat.apply
    println(cat2)
    //创建对象的方式三(需要在对象中定义apply()方法)(推荐)
    val cat3 = Cat()
    println(cat3)
    //获得对象的方式四
    val cat4 = Cat
    println(cat4 + "\t" + Cat)
  }
}

class Cat {

}

object Cat {
  //object中apply()方法一般去创建一个对象
  def apply() = new Cat
}
