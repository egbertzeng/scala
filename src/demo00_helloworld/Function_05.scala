package demo00_helloworld

/**
 * Created by liguohua on 2015/2/16.
 */
object Function_05 {
  def main(args: Array[String]) {
    //函数调用
    val i: Int = addOne(3)
    println(i)
    //函数调用
    print()
    //函数调用，如果无参，可以省略（）
    print
    //
    val m = max(3, 40)
    println(m)
  }

  //函数定义
  def addOne(m: Int): Int = m + 1

  //函数定义
  def print() {
    println("this is a function")
  }

  def max(x: Int, y: Int) = if (x > y) x else y

}
