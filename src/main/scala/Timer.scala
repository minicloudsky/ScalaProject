/** **
 * 在Scala里面，函数即对象，因此可以将函数作为参数传递，存储在变量里面，
 * 返回给其他函数，这是函数式编程的里程碑。
 */
/**
 * 计时器函数，每秒执行一些操作
 */
object Timer {
  def oncePerSecond(callback: () => Unit): Unit = {
    while (true) {
      callback();
      Thread sleep 1000
    }
  }

  def timeFlies(): Unit = {
    println("time flies like an arrow...")
  }

  def main(args: Array[String]): Unit = {
    // 注册回调函数调用
    oncePerSecond(timeFlies)
  }
}