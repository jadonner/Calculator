package calculator.model.states

import calculator.model.Calculator

class LHSDecimalPressed(calc: Calculator) extends LHS(calc) {

//  override def displayNumber(): Double = {
//    calc.display
//  }
//
//  override def clearPressed(): Unit = {
//    calc.display = 0.0
//    calc.lhs = "0"
//    calc.rhs = "0"
//    calc.state = new LHS(calc)
//  }
//
//  override def numberPressed(number: Int): Unit = {
//    calc.lhs += number.toString
//    calc.display = calc.lhs.toDouble
//  }
//
//  override def dividePressed(): Unit = {
//    calc.operation = (lhs: Double, rhs: Double) => lhs/rhs
//    calc.state = new Operation(calc)
//  }
//
//  override def multiplyPressed(): Unit = {
//    calc.operation = (lhs: Double, rhs: Double) => lhs*rhs
//    calc.state = new Operation(calc)
//  }
//
//  override def subtractPressed(): Unit = {
//    calc.operation = (lhs: Double, rhs: Double) => lhs-rhs
//    calc.state = new Operation(calc)
//  }
//
//  override def addPressed(): Unit = {
//    calc.operation = (lhs: Double, rhs: Double) => lhs+rhs
//    calc.state = new Operation(calc)
//  }
//
//  override def equalsPressed(): Unit = {
//    calc.state = new LHS(calc)
//  }

  override def decimalPressed(): Unit = {

  }

}
