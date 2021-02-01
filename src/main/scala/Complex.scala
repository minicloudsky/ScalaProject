class Complex(real: Double, imaginary: Double) {
  def re(): Double = real

  def im(): Double = imaginary

  override def toString: String = "" + re + (if (im >= 0) "+" else "") + im + "i"
}

type Environment = String => Int
def eval(t: Tree, env: Environment): Int = t match {
  case Sum(l, r) => eval(l, env) + eval(r, env)
  case Var(n) => env(n)
  case Const(v) => v
}
def derive(t: Tree, v: String): Tree = t match {
  case Sum(l, r) => Sum(derive(l, v), derive(r, v))
  case Var(n) if (v == n) => Const(1)
  case _ => Const(0)
}

object ComplexNumbers {
  def main(args: Array[String]): Unit = {
    val c = new Complex(1.2, 2.4)
    println("imaginary part: " + c.im())
    println("Overridden toString(): " + c.toString)
    val list2 = "android" :: "iOS" :: "H5" :: Nil
    // 以上等价于
    var list3 = List("android", "iOS", "H5")
    val map = Map("one" -> 1, "two" -> 2, "three" -> 3)
    println(list3)
    println(map)
    // 给 Int 类型起个别名 Environment
    type Environment = String => Int

  }
}