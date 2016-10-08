

/**
 * Created by liguohua on 2015/8/2.
 */
/*
*1.Scala的包是为了组织代码，中有两种包物理包和逻辑包
*2.物理包就是文件夹,用于组织文件
*3.逻辑包就是代码块,用于组织代码(包中只能写类或包)
*4.逻辑包有的带{}，有的不带{}
*/
//这是一个逻辑包，没有{}，从定义处到文件的文件的结束(可以不写)
package scala.demo17_package
//这是一个逻辑包，有{}，作用域为{}
package sparkx{
//包中可以定义子包
    package action{
      //子包中的抽象类
      abstract class  Action01{
        //类中的抽象方法
        def fun1
      }

    }
    //包中可以定义子包
    package action.impl{
      //子包包中的实现类
    class  Action01IMPL extends sparkx.action.Action01{
        //类中的实现方法
        override  def fun1: Unit ={
          println("fun run....")
        }
      }
    }
}
//这是一个逻辑包，有{}，作用域为{}
package hadoopx{

}
object O1_PackageDemo {
  def main(args: Array[String]) {
    val a1= new scala.demo17_package.sparkx.action.impl.Action01IMPL()
    a1.fun1
  }
}

