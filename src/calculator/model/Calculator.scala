package calculator.model

import calculator.model.states._

class Calculator() {

  var state: State = new LHS(this)

  var operation: (Double, Double) => Double = (lhs: Double, rhs: Double) => lhs+rhs

  var modeFunc: (Double) => Double = (a: Double) => (a)
  //var convertFunc: (Double) => (String) = (x: String) => modeFunc(Math.toDegrees(x.toDouble)).toString

  def convertLHS(lefths: String): Double = {
    modeFunc(lefths.toDouble)
  }

  var display: Double = 0.0
  var lhs: String = "0"
  var rhs: String = "0"
  //var pushList: List[]

  // Accessed by View. You should edit this method as you build functionality
  def displayNumber(): Double = {
    this.state.displayNumber()
  }

  def clearPressed(): Unit = {
    this.state.clearPressed()
  }

  def numberPressed(number: Int): Unit = {
    this.state.numberPressed(number)
  }

  def dividePressed(): Unit = {
    this.state.dividePressed()
  }

  def multiplyPressed(): Unit = {
    this.state.multiplyPressed()
  }

  def subtractPressed(): Unit = {
    this.state.subtractPressed()
  }

  def addPressed(): Unit = {
    this.state.addPressed()
  }

  def equalsPressed(): Unit = {
    this.state.equalsPressed()
  }

  def decimalPressed(): Unit = {
    this.state.decimalPressed()
  }

  def negatePressed(): Unit = {
    this.state.negatePressed()
  }

  def cosPressed(): Unit = {
    this.state.cosPressed()
  }

  def sinPressed(): Unit = {
    this.state.sinPressed()
  }

  def radPressed(): Unit = {
    this.state.radPressed()
  }

  def degPressed(): Unit = {
    this.state.degPressed()
  }

}
