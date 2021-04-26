package calculator.model.states

import calculator.model.Calculator

abstract class State(calc: Calculator) {


  //var divOp: (Double, Double) => Double = (lhs: Double, rhs: Double) => lhs/rhs
  //var multOp: (Double, Double) => Double = (lhs: Double, rhs: Double) => lhs*rhs
  //var subOp: (Double, Double) => Double = (lhs: Double, rhs: Double) => lhs-rhs
  //var addOp: (Double, Double) => Double = (lhs: Double, rhs: Double) => lhs+rhs

  def displayNumber(): Double

  def clearPressed(): Unit

  def numberPressed(number: Int): Unit

  def dividePressed(): Unit

  def multiplyPressed(): Unit

  def subtractPressed(): Unit

  def addPressed(): Unit

  def equalsPressed(): Unit

  def decimalPressed(): Unit

  def negatePressed(): Unit

  def cosPressed(): Unit

  def sinPressed(): Unit

  def radPressed(): Unit

  def degPressed(): Unit

}
