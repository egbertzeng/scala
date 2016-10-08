package demo12_Implicit

/**
 * Created by liguohua on 2015/3/1.
 */
class O5_ImplicitDemo {

}

object O5_ImplicitDemo {
  def main(args: Array[String]) {
    val rs = 0.incr(3)
    println(rs)
  }

  //隐式类不能是顶层类
  implicit class Caculate(i: Int) {
    //定义一个增强方法
    def incr(i: Int): Int = i + 1
  }

  implicit class Pow(g: GrandF) {
    def pow(): Unit ={
      println("get power")
    }
  }
}







