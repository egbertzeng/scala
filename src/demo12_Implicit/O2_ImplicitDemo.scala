package demo12_Implicit

/**
 * Created by liguohua on 2015/3/1.
 */
class O2_ImplicitDemo {

}

object O2_ImplicitDemo {
  def main(args: Array[String]) {
    //应用增强
    implicit def Power(x: GrandFather) = new Power(x)
    //整个类的继承体系对将拥有增强
    val grandFather = new GrandFather
    grandFather.power
    val father = new Father
    father.power
    val son = new Son
    son.power
  }
}

//定义多代不允许修改的类
class GrandFather {}

class Father extends GrandFather {}

class Son extends Father {}

//定义增强类
class Power(x: GrandFather) {
  def power: Unit = {
    println("get power...")
  }
}