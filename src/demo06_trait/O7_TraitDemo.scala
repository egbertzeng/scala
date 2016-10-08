package demo06_trait

/**
 * Created by liguohua on 2015/8/1.
 */
class O7_TraitDemo {

}
object O7_TraitDemo {
  def main(args: Array[String]) {
    val w= new Work with Advice
    w.log//1.前置增强 2.方法执行  3.后置增强

  }
}

trait  Action{
   def log
}
//trait  Action 的具体实现类
class  Work extends  Action{
  override  def log: Unit ={
    println("Work log")
  }
}
//trait  Action 的增强trait
trait  Advice extends  Action{
  //虽然复写了抽象方法，但也调用了抽象方法，因此此方法还应该是抽象的
  abstract  override  def log: Unit ={
    println("befor log ....")
    super.log
    println("after log ....")
  }
}