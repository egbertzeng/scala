package demo14_IO

/**
 * Created by liguohua on 2015/3/31.
 */
class O2_IODemo {

}

object O2_IODemo {
  //演示，如何从键盘输入信息
  def main(args: Array[String]) {
    print("Please enter your input : ")
    val line = Console.readLine
    println ("Thanks, you just typed: " + line)
  }
}

