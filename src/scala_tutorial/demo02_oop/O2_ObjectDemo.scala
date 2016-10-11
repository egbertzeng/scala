package scala_tutorial.demo02_oop

/**
 * Created by liguohua on 2015/2/28.
 */
class O2_ObjectDemo {

}

object O2_ObjectDemo {
  def main(args: Array[String]) {
    val s1 = new Student1
    println(s1)
    val s2 = new Student2("zhangsan")
    println(s2)
    val s3 = new Student3("lisi")
    println(s3.name)
//    val s4 = new Student3(18, "wangwu")
//    println(s4.name)
//    val s5 = new Student3(19, "female", "wangwu")
//    println(s5.name)

    println("--------------------以下代码，用于给小尖尖演示Scala的方便-----------------------------")
    //1.创建对象
    var stu=new Student(2,"lisi","henan")
    println(stu.toString)
    //2.setter方法
    stu.age=29
    //3.getter方法
    println(stu.age)


  }

  //用于解释类的构造方法
  //每个类都有一个主构造器，默认是无参的，其中class  Student的完整写法如下
  //主构造器会类中语句都执行，因此here is run会打印
  class Student1(){
    //成员变量有默认值和java一致
    var name: String = _
    var age: Int = _
    var sex: String = _
   println("here is run")
  }

  //主构造器中的参数如果没有var 或者val则相当于声明了私有成员变量
  class Student2(var name: String) {
    //var name:String=_//错误，主构造器中的变量，直接转换为成员变量,不需要再次声明
    var age: Int = _
    var sex: String = _
  }

  //用于解释辅助构造器
  class Student3 (var name: String) {
    var age: Int = _
    var sex: String = _

    //这是一个辅助构造器，辅助构造器中一定包含主构造器的参数(调用需要)
    def this (age: Int, name: String) {
      //辅助构造器的第一行必须要调用主构造器
      this(name)
      //此后才会做辅助构造器自己的内容
      this.age = age
    }

    //这是一个辅助构造器
    def this(age: Int, sex: String, name: String) {
      //辅助构造器的第一行必须要调用主构造器
      this(name)
      //此后才会做辅助构造器自己的内容
      this.age = age
      this.sex = sex

    }
  }
   /*
     用于给小尖尖演示Scala的方便
   */
  class Student(var age:Int,var name:String,var addr:String){
    override def toString = s"Student(age=$age, name=$name, addr=$addr)"
  }

}


