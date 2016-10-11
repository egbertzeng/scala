package scala_tutorial.demo09_Match

/**
 * Created by liguohua on 2015/3/1.
 */
class O3_MatchDemo {

}

object O3_MatchDemo {
  def main(args: Array[String]) {
    test("2")
  }

  def test(obj: Any): Unit = {
    //匹配可以进行类型判定
    val rs = obj match {
      case i: Int => "Int type"
      case s: String => "String type"
      case _ => "other type"
    }
    println(rs)
  }
}
