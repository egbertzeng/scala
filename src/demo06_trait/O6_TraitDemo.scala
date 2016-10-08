package demo06_trait

/**
 * Created by liguohua on 2015/8/1.
 */

class Human{
  println("construct Human!")
}
//trait可以继承自类，Java不可以
trait Student extends  Human{
  println("construct Student!")
}
trait Teacher extends  Human{
  println("construct Teacher!")
}
//构造顺序是从左至右，但不会重复构造Human
class Dugg extends  Human with  Student with Teacher{
  println("construct Dugg!")
}
object O6_TraitDemo {
  def main(args: Array[String]) {
     val  d = new Dugg()
  }
}
