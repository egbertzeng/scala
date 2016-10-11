package scala_tutorial.demo12_Implicit

/**
 * Created by liguohua on 2015/3/1.
 */
class O4_ImplicitDemo {

}

object O4_ImplicitDemo {
  def main(args: Array[String]) {
    implicit val name = "zhangsan"
    implicit val age = 20


    //test()//错误
    //test//正确,
    //test(name)//正确
    //test(implicitly)//正确
    test("xiaoqiang") //正确

    //test2()//错误
    //test2//正确
    //test2(name,age)//正确
    //test2(implicitly,implicitly)//正确
    //test2(implicitly,67)//正确
    //test2("huangzhong", 67) //正确


    implicit val age2 = 25
    //test2//错误
    //test2(implicitly,implicitly)//错误
    test2(implicitly,67)//正确
  }

  def test(implicit name: String): Unit = {
    println(name)
  }

  def test2(implicit name: String, age: Int): Unit = {
    println(name + "\t" + age)
  }

}
