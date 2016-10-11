package scala_tutorial.demo10_CaseClass

/**
 * Created by liguohua on 2015/3/1.
 */
class O1_CaseClassDemo {

}

object O1_CaseClassDemo {
  def main(args: Array[String]) {
    test2
  }

  def test2: Unit = {
    var obj: Any = new Object()
    obj = Student("张三", 18, 'm')
    obj = Animal("狗", 3, 'f')
    //case class 可以用于匹配
    obj match {
      case Student(name, age, sex) => println("student type")
      case Animal(name, age, sex) => println("student type")
      case _ => println("error type")
    }

  }

  def test1: Unit = {
    //用case class创建一个对象，不需要new,因为它已经实现好了apply()方法
    val stu = Student("张三", 18, 'm')
    println(stu)
    //用case class创建一个对象
    val ani = Animal("狗", 3, 'f')
    println(ani)
  }
}

//定义一个case class
case class Student(val name: String, val age: Int, val sex: Char) {

}

//定义一个case class，主构造器中的参数默认是val。可以使用但不建议使用var
case class Animal(name: String, age: Int, sex: Char) {

}
