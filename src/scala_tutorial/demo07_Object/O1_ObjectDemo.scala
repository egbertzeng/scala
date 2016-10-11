package scala_tutorial.demo07_Object

/**
 * Created by liguohua on 2015/3/1.
 */
class O1_ObjectDemo {

}

object O1_ObjectDemo {
  def main(args: Array[String]) {
    //打印Fish对象，会调用它的toString()方法
    println(Fish)
    //调用test()方法
    Fish.test
    //static()方法
    Fish.static

  }
}

class Fish {

}

//此处就意味着用Fish类创建了一个对象，对象的名称是Fish
//这个对象中的所有方法都是静态的,你可以直接使用其中的方法
object Fish {
  //在Fish中定义一个静态方法test()
  def test() {
    println("object Fish test()")
  }

  //static在scala中并不是关键字，你甚至可以定义一个名称为static 的方法
  def static(): Unit = {
    println("object Fish static()")
  }
}