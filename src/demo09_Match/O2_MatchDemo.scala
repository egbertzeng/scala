package demo09_Match

/**
 * Created by liguohua on 2015/3/1.
 */
/**
 * Created by liguohua on 2015/3/1.
 */
class O2_MatchDemo {

}

object O2_MatchDemo {
  def main(args: Array[String]) {
    test1
  }

  def test1: Unit = {
    val v1 = 3
    val rs = v1 match {
      //case中可以加入条件守卫
      case i if (i == 1) => "number one"
      case i if (i == 2) => "number two"
      case i if (i == 3) => "number three"
      case _ => "error number"
    }
    println(rs)
  }

  def test2: Unit = {
    val v1 = 3
    val rs = v1 match {
      //case中可以加入多个条件守卫
      case i if (i == 1) && (i > 0) => "number one"
      case i if (i == 2) || (i > 1 && i < 2) => "number two"
      case i if !(i != 3) => "number three"
      case _ => "error number"
    }
    println(rs)
  }
}
