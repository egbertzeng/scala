package scala.demo18_accessModifier

/**
 * Created by liguohua on 2015/8/2.
 */
/**
 * 1.访问权限有private和protected两种
 * 1.1.private表示私有
 * 1.2.protected表示为继承
 * 2.访问权限可以作用于，类，实例，变量
 * 3.访问权限可以指明所属
 */
package PackageTestAll {
package PackageTest {

/*
一，属于包
 */
//Navi类->spark包  （private或protected）
private[PackageTest] class Navi {
  //test数据->spark包  （private或protected）
  private[PackageTest] val name = "china"

  //test方法->spark包  （private或protected）
  protected[PackageTest] def test(): Unit = {
    println("test()")
  }
}

}

package ClassTest {

/*
二，属于类
 */
class Nade {
  private[Nade] val name = "zhangsan"

  //fun1方法->Nade类 （private或protected）
  protected[Nade] def fun1 {}
}

}

package ObjectTest {


/*
三，属于对象
 */
class Dog {
  //fun1方法->this （private或protected）
  private [this] val name = "zhangsan"
  //fun1方法->this（private或protected）
  private [this] def fun1 {}
}

}

}


object O1_AccessModifier {
  def main(args: Array[String]) {

  }
}
