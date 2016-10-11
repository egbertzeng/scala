package scala_tutorial.demo02_oop

/**
 * Created by liguohua on 2015/8/1.
 */
class Outer(var name:String){
  outer=> class Inner(var name:String){
    def find(): Unit ={
      println(this.name)
    }
    def findx(): Unit ={
      println(this.name+","+outer.name)
    }
    def check(in:Inner): Unit ={
      println("哈哈")
    }
  }
  def find(): Unit ={
    println(this.name)
  }
}
object O3_InnerClass {
  def main(args: Array[String]): Unit = {
    //创建外部类对象
    val t = new Outer("tiesan1")
    println(t.name)
    t.find()
    //创建外部类对象
    val s = new t.Inner("sunwukong1")
    println(s.name)
    s.find()
    //内部类对象访问外部类对象的成员
    s.findx()


    //一定要注意，内部类存储于外部类的对象
    val t2=new Outer("tie")
    val s1=new t2. Inner("sun1")

    s1.check(s1)
    s.check(s)
   // s1.check(s)//erro




  }
}
