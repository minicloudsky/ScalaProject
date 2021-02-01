import java.util.{Date, Locale}
import java.text.DateFormat._

/** *
 * Scala 默认会导入 java.lang下面的所有包，其他的需要明确指出导入
 * 导入一个包下的所有 class 或者包，用下划线代替java的 * 号
 * import java._
 */
object FrenchDate {
  def main(args: Array[String]): Unit = {
    var now = new Date
    val df = getDateInstance(LONG, Locale.TRADITIONAL_CHINESE)
    // 中置语法，等价于 df.format(now)
    println(df format now)
    println(df.format(now))
  }
}
