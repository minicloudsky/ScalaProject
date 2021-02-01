/**
 *
 * 匿名函数，右箭头 => 分隔函数参数和函数体,这个例子里面，函数参数是空的
 */
object TimerAnonymous {
  def oncePerSecond(callback: () => Unit): Unit = {
    while (true) {
      callback();
      Thread sleep 1000
    }
  }

  def main(args: Array[String]): Unit = {
    //    oncePerSecond(() =>
    //      println("time flies like an arrow..."))
    oncePerSecond(() =>
      println("hello world ."))
  }
}