package scala_runoob.函数010

/**
  * Created by liguohua on 16/10/11.
  */

/**
  * Scala的解释器在解析函数参数(function arguments)时有两种方式：
  * 传值调用（call-by-value）：先计算参数表达式的值，再应用到函数内部；
  * 传名调用（call-by-name）：将未计算的参数表达式直接应用到函数内部
  * 在进入函数内部前，传值调用方式就已经将参数表达式的值计算完毕，而传名调用是在函数内部进行参数表达式的值计算的。
  * 这就造成了一种现象，每次使用传名调用时，解释器都会计算一次表达式的值。
  */
object 函数传名调用001 {
  def main(args: Array[String]) {
    delayed(time());
  }

  def time() = {
    println("获取时间，单位为纳秒")
    System.nanoTime
  }

  def delayed(t: => Long) = {
    println("在 delayed 方法内")
    //time()在此处才真正执行！
    println("参数： " + t)
    t
  }
}