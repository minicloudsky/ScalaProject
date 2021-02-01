import org.omg.CORBA.Environment

/** *
 * Case Class 和普通的 class区别
 * new 关键字不再用于创建 类，用 Const(5) 代替 new Const(5)
 * 构造参数 的 getter 函数默认被自动定义
 * equals 和 hashCode 方法被默认定义，可以在实例的结构上工作而不是他们实体上
 * Case class 的实例可以Beowulf模式匹配分解。
 */
abstract class Tree

case class Sum(l: Tree, r: Tree) extends Tree

case class Var(n: String) extends Tree

case class Const(v: Int) extends Tree

//def eval(t: Tree, env: Environment): Int = t match {
//  case Sum(l, r) => eval(l, env) + eval(r, env)
////  case Var(n)    => env(n)
//  case Const(v)  => v
//  case t if(t==1) => 1
////  case env:String => "unexcepted value: "+t
//
//}