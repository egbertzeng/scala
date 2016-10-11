package scala_runoob.函数010

/**
  * Created by liguohua on 16/10/11.
  */
/**
  * Scala 可以为函数参数指定默认参数值，使用了默认参数，你在调用函数的过程中可以不需要传递参数
  * ，这时函数就会调用它的默认参数值，如果传递了参数，则传递值会取代默认值。
  */
object 函数默认参数值005 {
  def main(args: Array[String]) {
    println( "返回值 : " + addInt() );
  }
  //函数定义时，参数上有默认值，当调用时不传值就使用默认值！
  def addInt( a:Int=5, b:Int=7 ) : Int = {
    var sum:Int = 0
    sum =( a + b)
    sum
  }
}
