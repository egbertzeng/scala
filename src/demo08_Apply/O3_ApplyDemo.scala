package demo08_Apply

/**
 * Created by liguohua on 2015/3/1.
 */
class O3_ApplyDemo {

}

object O3_ApplyDemo {
  def main(args: Array[String]) {
    //创建对象的方式一
    val pig1 = new Pig
    println(pig1)
    pig1() //instance apply()
    //创建对象的方式二(需要在对象中定义apply()方法)
    val pig2 = Pig.apply()//object apply()
    pig2() //instance apply()
    //创建对象的方式三(需要在对象中定义apply()方法)(推荐)
    val pig3 = Pig()//object apply()
    pig3() //instance apply()
    //获得对象的方式四
    val pig4 = Pig//val pig4=object
    pig4() //object apply()

  }
}

class Pig {
  def apply() = {
    println("instance apply()")
  }

}

object Pig {
  //object中apply()方法一般去创建一个对象
  def apply() ={
    println("object apply()")
    new Pig
  }
}