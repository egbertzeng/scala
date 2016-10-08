package demo12_Implicit

/**
 * Created by liguohua on 2015/3/1.
 */
class O1_ImplicitDemo {

}

object O1_ImplicitDemo {
  def main(args: Array[String]) {
    //为不允许修改的类增强功能
    //implicit  def Enhance(p:IBMComputer)=new Enhance(p)
    //implicit  def Hahahaha(p:IBMComputer)=new Enhance(p)
    implicit def p2IBMComputer(p: IBMComputer) = new Enhance(p)
    //不允许修改的类的功能被增强了
    val ibmc = new IBMComputer
    ibmc.add()

  }
}

//假设此类不允许修改
class IBMComputer {

}

//增强功能
class Enhance(p: IBMComputer) {
  def add(): Unit = {
    println("computing......")
  }
}