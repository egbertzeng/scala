package scala_runoob.函数010

/**
  * Created by liguohua on 16/10/11.
  */
/**
  * Scala 同样支持递归函数。
  * 递归函数意味着函数可以调用它本身。
  */
object 递归函数004 {
  def main(args: Array[String]) {
    for (i <- 1 to 10) {
      println(i + " 的阶乘为: = " + factorial(i))
    }
  }

  def factorial(n: BigInt): BigInt = {
    if (n <= 1) {
      return 1
    } else {
      //递归调用
      return n * factorial(n - 1)
    }
  }
}
