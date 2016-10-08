package demo07_Object

/**
 * Created by liguohua on 2015/3/1.
 */
class O2_ObjectDemo {

}

object O2_ObjectDemo {
  def main(args: Array[String]) {
    for (j <- 1 to 5) {
      Dog.icre
    }
    println(Dog.i)
  }

}

class Dog {

}

//此对象就是一个单例对象
object Dog {
  var i = 0

  def icre: Unit = {
    i += 1
  }
}