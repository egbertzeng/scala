package demo12_Implicit

/**
 * Created by liguohua on 2015/3/1.
 */
class O3_ImplicitDemo {

}
object O3_ImplicitDemo {
  def main(args: Array[String]) {
    implicit var s="zhaoliu"
    test
  }
  //implicit val name="zhangsan"
  //implicit var name="lisi"
  //implicit var s="wangwu"
  def test(implicit name:String): Unit ={
    println(name)
  }
}
