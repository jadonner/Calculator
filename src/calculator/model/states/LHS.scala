package calculator.model.states

import calculator.model.Calculator

class LHS(calc: Calculator) extends State(calc) {

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
    calc.lhs += number.toString
    calc.display = calc.lhs.toDouble
  }

  override def dividePressed(): Unit = {
    calc.operation = (lhs: Double, rhs: Double) => lhs/rhs
    calc.state = new Operation(calc)
  }

  override def multiplyPressed(): Unit = {
    calc.operation = (lhs: Double, rhs: Double) => lhs*rhs
    calc.state = new Operation(calc)
  }

  override def subtractPressed(): Unit = {
    calc.operation = (lhs: Double, rhs: Double) => lhs-rhs
    calc.state = new Operation(calc)
  }

  override def addPressed(): Unit = {
    calc.operation = (lhs: Double, rhs: Double) => lhs+rhs
    calc.state = new Operation(calc)
  }

  override def equalsPressed(): Unit = {
    calc.state = new LHS(calc)
  }

  override def decimalPressed(): Unit = {
    calc.lhs += "."
    calc.state = new LHSDecimalPressed(calc)
  }

  override def negatePressed(): Unit = {
    calc.lhs = (calc.lhs.toDouble * -1).toString
    calc.display = calc.lhs.toDouble
  }

  override def cosPressed(): Unit = {
    println(calc.lhs)
    calc.lhs = (Math.cos(calc.convertLHS(calc.lhs))).toString
    println(calc.lhs)
    calc.display = calc.lhs.toDouble
    //calc.state = new LHS(calc)
  }

  override def sinPressed(): Unit = {
//    println(calc.lhs)
//    calc.lhs = (calc.modeFunc(calc.lhs.toDouble)).toString
//    println(calc.lhs)
//    calc.lhs = Math.sin(calc.lhs.toDouble).toString
//    println(calc.lhs)
    calc.lhs = Math.sin(calc.convertLHS(calc.lhs)).toString
    calc.display = calc.lhs.toDouble
    //calc.state = new LHS(calc)
  }

  override def radPressed(): Unit = {
//    calc.lhs = (Math.toRadians(calc.lhs.toDouble)).toString
//    calc.display = calc.lhs.toDouble
    //println(calc.modeFunc)
    calc.modeFunc = (a: Double) => a * Math.PI/180
    //println(calc.modeFunc)
  }

  override def degPressed(): Unit = {
//    calc.lhs = (Math.toDegrees(calc.lhs.toDouble)).toString
//    calc.display = calc.lhs.toDouble
    //calc.modeFunc = (a: Double) => Math.toRadians(a)
    calc.modeFunc = (a: Double) => a * 180/Math.PI
    //println(calc.modeFunc)
  }

}
