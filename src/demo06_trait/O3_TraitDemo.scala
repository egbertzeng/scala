package demo06_trait

/**
 * Created by liguohua on 2015/3/1.
 */
class O3_TraitDemo {

}

object O3_TraitDemo {
  def main(args: Array[String]) {
    //创建对象
    val v1 = new SubD
    v1.t1
    //创建对象
    val v2 = new SubE
    v2.t1
    v2.t2
    v2.t3

  }
}

trait A {
  def t1: Unit = {
    println("A t1")
  }
}

//一个特质可以去继承一个特质
trait B {
  def t2: Unit = {
    println("B t2")
  }
}

trait C {
  def t3: Unit = {
    println("C t3")
  }
}

//一个特质可以继承一个特质
trait D extends A {

}

//一个特质可以继承一个特质后，再with多个特质，这些特质从左至右依次构造
trait E extends A with B with C {

}

class SubD extends D {

}

class SubE extends E {

}