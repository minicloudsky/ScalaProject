object AllObj {
  def main(args: Array[String]): Unit = {
    /** *
     *
     * Scala 里面万物皆对象，算术表达式也包含方法调用
     */
    val salary = 2000
    val bounce = 1 + 2 * 3 / salary
    // 以上算法运算，等价于
    val newBounce = 1.+(2.*(3)./(salary))
  }
}
