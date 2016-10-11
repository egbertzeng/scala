package scala_tutorial.demo08_Apply

/**
 * Created by liguohua on 2015/3/31.
 */
class O4_ApplyDemo {

}
object O4_ApplyDemo {
  def main(args: Array[String]) {
    //用object  Student的apple()方法，创建对象
    Student("stu001","zhangsan","shandong")
  }

}
class  Student(var id :String, var name:String,var addr:String){
}
object  Student{
       def apply( id :String,  name:String, addr:String)={
         println("object Student.apple()")
         new Student(id,name,addr)
       }

}
