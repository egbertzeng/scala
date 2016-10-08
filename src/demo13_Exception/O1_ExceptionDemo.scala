package demo13_Exception

import java.io.{FileNotFoundException, FileReader, IOException}

/**
 * Created by liguohua on 2015/3/31.
 */
/**
 * 1.在scala中的异常和java中的异常处理模型基本一致
 * 2.对应异常的匹配方式与java不大一样
 * 3.scala中的异常没有checkedException，相当于scala中全是runtimeException
 */
class O1_ExceptionDemo {

}

object O1_ExceptionDemo {
  def main(args: Array[String]) {

    test2
  }

  //演示try-catch-finally
  def test2: Unit = {
    try {
      val f = new FileReader("input.txt")
    } catch {
      case ex: FileNotFoundException => {
        println("Missing file exception"+ex.getMessage)
        //throw  ex//并不影响finally的执行,但会影响异常块后的执行
      }
      case ex: IOException => {
        println("IO Exception"+ex.getStackTrace)
      }
    } finally {
      println("Exiting finally...")
    }
    println("here is coming.....")
  }

  //演示try-catch
  def test1: Unit = {
    try {
      val f = new FileReader("input.txt")
    } catch {
      case ex: FileNotFoundException => {
        println("Missing file exception" + ex)
        ex.printStackTrace()

      }
      case ex: IOException => {
        println("IO Exception")
        //抛出异常
        throw ex
      }
    }
    println("here is coming....")
  }
}

