package calculator.model.states

import calculator.model.Calculator

class RHS(calc: Calculator) extends State(calc) {

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
    calc.rhs += number.toString
    calc.display = calc.rhs.toDouble
  }

  override def dividePressed(): Unit = {
    calc.lhs = calc.operation(calc.lhs.toDouble, calc.rhs.toDouble).toString
    calc.operation = (lhs: Double, rhs: Double) => lhs/rhs
    calc.rhs = "0"
    calc.state = new Operation(calc)
  }

  override def multiplyPressed(): Unit = {
    calc.lhs = calc.operation(calc.lhs.toDouble, calc.rhs.toDouble).toString
    calc.operation = (lhs: Double, rhs: Double) => lhs*rhs
    calc.state = new Operation(calc)
    calc.rhs = "0"
    //    calc.state = new RHS(calc)
  }

  override def subtractPressed(): Unit = {
    calc.lhs = calc.operation(calc.lhs.toDouble, calc.rhs.toDouble).toString
    calc.operation = (lhs: Double, rhs: Double) => lhs-rhs
    calc.state = new Operation(calc)
    calc.rhs = "0"
    //    calc.state = new RHS(calc)
  }

  override def addPressed(): Unit = {
    calc.lhs = calc.operation(calc.lhs.toDouble, calc.rhs.toDouble).toString
    calc.operation = (lhs: Double, rhs: Double) => lhs+rhs
    calc.rhs = "0"
    calc.state = new Operation(calc)
    //    calc.state = new RHS(calc)
  }

  override def equalsPressed(): Unit = {
    calc.lhs = calc.operation(calc.lhs.toDouble, calc.rhs.toDouble).toString
    calc.display = calc.lhs.toDouble
    calc.rhs = "0"
    calc.state = new LHSDecimalPressed(calc)
  }

  override def decimalPressed(): Unit = {
    calc.rhs += "."
    calc.state = new RHSDecimalPressed(calc)
  }

  override def negatePressed(): Unit = {
    calc.rhs = (calc.rhs.toDouble * -1).toString
    calc.display = calc.rhs.toDouble
  }

  override def cosPressed(): Unit = {
    calc.rhs = (Math.cos(calc.convertLHS(calc.rhs))).toString
    calc.display = calc.rhs.toDouble
  }

  override def sinPressed(): Unit = {
    calc.rhs = (Math.sin(calc.convertLHS(calc.rhs))).toString
    calc.display = calc.rhs.toDouble
  }

  override def radPressed(): Unit = {
//    calc.rhs = (Math.toRadians(calc.rhs.toDouble)).toString
//    calc.display = calc.rhs.toDouble
    calc.modeFunc = (a: Double) => a * Math.PI/180
  }

  override def degPressed(): Unit = {
//    calc.rhs = (Math.toDegrees(calc.rhs.toDouble)).toString
//    calc.display = calc.rhs.toDouble
    calc.modeFunc = (a: Double) => a * 180/Math.PI
  }

}
