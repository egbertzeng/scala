package scala_runoob.函数010

/**
  * Created by liguohua on 16/10/11.
  */
class 指定函数参数名002 {

}
object Test {
  def main(args: Array[String]) {
    //传参数时指定参数名称，参数不用按指定顺序传递！
    printInt(b=5, a=7);
  }

  def printInt( a:Int, b:Int ) = {
    println("Value of a : " + a );
    println("Value of b : " + b );
  }
}