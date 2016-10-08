package demo14_IO

import java.io._

import scala.io.Source

/**
 * Created by liguohua on 2015/3/31.
 *
 */
class O1_IODemo {

}

object O1_IODemo {
  def main(args: Array[String]) {
  }

  //演示读操作
  def readOperate(filePath: String): Unit = {

    //读取方式一（一般）
    val file1=Source.fromFile("d:/test.txt")
    for (line<-file1.getLines()){
      println(line)
    }
    file1.close()
    //读取方式二（简化）
    val file2=Source.fromFile("d:/test.txt")
    file2.foreach(print)
    file2.close()

    //读取方式三（网络）
    val file3=Source.fromURL("http://spark.apache.org")
    for(line<-file3.getLines){
      println(line)
    }

  }

  def consoleTest(): Unit ={
    println("请输入姓名")
    val input = readLine()
    println("你输入的内容是"+input)
  }

  //演示写操作
  def writeOperate(filePath: String): Unit = {
    val writer = new PrintWriter(new File(filePath))
    writer.write("Hello Scala")
    writer.close()
    println(writer)
  }

}
