package demo12_Implicit

/**
 * Created by liguohua on 2015/3/1.
 */
class O6_ImplicitDemo {


}

object O6_ImplicitDemo {
  def main(args: Array[String]) {
    val g = new GrandF
    g.pow
    val f = new F
    f.pow
    val s = new S
    s.pow
  }

  implicit class Pow(g: GrandF) {
    def pow(): Unit = {
      println("get power")
    }
  }

}


class GrandF {}

class F extends GrandF {}

class S extends F {}





