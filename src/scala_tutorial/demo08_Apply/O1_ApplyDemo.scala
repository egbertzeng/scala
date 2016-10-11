package scala_tutorial.demo08_Apply

/**
 * Created by liguohua on 2015/3/1.
 */
class O1_ApplyDemo {

}

object O1_ApplyDemo {
  def main(args: Array[String]) {
    //调用apply()方法的方式一
    Dog.apply()
    //调用apply()方法的方式二
    Dog()


  }
}

class Dog {
}

object Dog {
  //对象中的apply()方法
  def apply(): Unit = {
    println("object Dog apply()")
  }
}
