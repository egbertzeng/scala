package demo06_trait

/**
 * Created by liguohua on 2015/3/1.
 */
class O4_TraitDemo {

}

object O4_TraitDemo {
  def main(args: Array[String]) {
    //创建对象时候混入特质
    val v1 = new Birds with X
    v1.t1
    //创建对象时可以混入多个特质，从左至右依次构造
    val v2 = new Birds with X with Y
    v2.t1
    v2.t2
    //对象混入的trait中如果有抽象成员，必须实现。（原理是匿名Z的子类）
    val v3 = new Birds with X with Z with Y {
      override def t3 {
        println("son Z t3")
      }
    }
    v3.t1
    v3.t2
    v3.t3
  }
}

trait X {
  def t1: Unit = {
    println("X t1")
  }
}

trait Y {
  def t2: Unit = {
    println("X t2")
  }
}

trait Z {
  def t3
}

class Birds {

}
