package calculator.model.states

import calculator.model.Calculator

class Operation(calc: Calculator) extends State(calc) {

  override def displayNumber(): Double = {
    calc.display
  }

  override def clearPressed(): Unit = {
    calc.display = 0.0
    calc.lhs = "0"
    calc.rhs = "0"
    calc.state = new LHS(calc)
  }

  override def numberPressed(number: Int): Unit = {
    calc.rhs = number.toString
    calc.display = calc.rhs.toDouble
    calc.state = new RHS(calc)
//    calc.lhs += number.toString
//    calc.display += calc.lhs.toDouble
//    calc.state
  }

  override def dividePressed(): Unit = {
    calc.operation = (lhs: Double, rhs: Double) => lhs/rhs
    //val lhs = calc.lhs.toDouble
    //val rhs = calc.rhs.toDouble
    //operation(lhs, rhs)
  }

  override def multiplyPressed(): Unit = {
    calc.operation = (lhs: Double, rhs: Double) => lhs*rhs
//    val lhs = calc.lhs.toDouble
//    val rhs = calc.rhs.toDouble
//    operation(lhs, rhs)
  }

  override def subtractPressed(): Unit = {
    calc.operation = (lhs: Double, rhs: Double) => lhs-rhs
//    val lhs = calc.lhs.toDouble
//    val rhs = calc.rhs.toDouble
//    operation(lhs, rhs)
  }

  override def addPressed(): Unit = {
    calc.operation = (lhs: Double, rhs: Double) => lhs+rhs
//    val lhs = calc.lhs.toDouble
//    val rhs = calc.rhs.toDouble
//    operation(lhs, rhs)
  }

  override def equalsPressed(): Unit = {
    //calc.state = new LHS(calc)
    //should do nothing
  }

  override def decimalPressed(): Unit = {
    calc.rhs += "."
    calc.state = new RHSDecimalPressed(calc)
  }

  override def negatePressed(): Unit = {

  }

  override def cosPressed(): Unit = {

  }

  override def sinPressed(): Unit = {

  }

  override def radPressed(): Unit = {

  }

  override def degPressed(): Unit = {

  }

}
