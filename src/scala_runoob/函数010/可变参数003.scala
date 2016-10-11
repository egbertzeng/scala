package scala_runoob.函数010

/**
  * Created by liguohua on 16/10/11.
  *
  *
  */

/**
  * Scala 允许你指明函数的最后一个参数可以是重复的，即我们不需要指定函数参数的个数，可以向函数传入可变长度参数列表。
Scala 通过在参数的类型之后放一个星号来设置可变参数(可重复的参数)
  */
object 可变参数003 {
  def main(args: Array[String]) {
    printStrings("lgh", "Runoob", "Scala", "Python");
  }

  //followers:String* 是一个可变参数，放到后面，可以传任意多个参数
  def printStrings(leader: String, followers: String*) = {
    println("leader is " + leader);
    var i: Int = 0;
    for (follower <- followers) {
      println("followers value[" + i + "] = " + follower);
      i = i + 1;
    }
  }
}