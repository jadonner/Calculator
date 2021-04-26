package tests

import calculator.model.Calculator
import org.scalatest.FunSuite

class TestEnterNumbers extends FunSuite {

  val EPSILON: Double = 0.000001

  def equalDoubles(d1: Double, d2: Double): Boolean = {
    (d1 - d2).abs < EPSILON
  }

  // Example test case
  test("Enter Numbers Test") {
    val calculator: Calculator = new Calculator()

    calculator.numberPressed(1)
    calculator.numberPressed(2)
    calculator.numberPressed(5)

    assert(equalDoubles(calculator.displayNumber(), 125.0), calculator.displayNumber())

    calculator.clearPressed()

    assert(equalDoubles(calculator.displayNumber(), 0.0), calculator.displayNumber())

    calculator.numberPressed(3)
    calculator.numberPressed(4)
    calculator.numberPressed(6)

    assert(equalDoubles(calculator.displayNumber(), 346.0), calculator.displayNumber())

    calculator.clearPressed()

    calculator.numberPressed(7)
    calculator.numberPressed(8)
    calculator.numberPressed(9)
    calculator.numberPressed(0)

    assert(equalDoubles(calculator.displayNumber(), 7890.0), calculator.displayNumber())

    calculator.clearPressed()

    calculator.numberPressed(7)
    calculator.decimalPressed()
    calculator.numberPressed(8)
    calculator.numberPressed(9)
    calculator.numberPressed(0)

    assert(equalDoubles(calculator.displayNumber(), 7.890), calculator.displayNumber())

    calculator.clearPressed()

    calculator.numberPressed(7)
    calculator.decimalPressed()
    calculator.numberPressed(8)

    assert(equalDoubles(calculator.displayNumber(), 7.8), calculator.displayNumber())

    calculator.clearPressed()
    calculator.numberPressed(7)
    calculator.decimalPressed()
    calculator.numberPressed(0)

    assert(equalDoubles(calculator.displayNumber(), 7.0), calculator.displayNumber())

    calculator.clearPressed()
    calculator.numberPressed(0)
    calculator.decimalPressed()
    calculator.numberPressed(0)

    assert(equalDoubles(calculator.displayNumber(), 0.0), calculator.displayNumber())

    calculator.clearPressed()
    calculator.numberPressed(0)

    assert(equalDoubles(calculator.displayNumber(), 0.0), calculator.displayNumber())

    calculator.clearPressed()
    calculator.numberPressed(0)
    calculator.numberPressed(0)
    calculator.numberPressed(0)
    calculator.numberPressed(2)
    calculator.decimalPressed()
    calculator.numberPressed(3)

    assert(equalDoubles(calculator.displayNumber(), 2.3), calculator.displayNumber())

    calculator.clearPressed()
    calculator.decimalPressed()
    calculator.numberPressed(3)

    assert(equalDoubles(calculator.displayNumber(), .3), calculator.displayNumber())

    calculator.clearPressed()
    calculator.numberPressed(2)
    calculator.decimalPressed()
    calculator.decimalPressed()
    calculator.numberPressed(3)
    calculator.decimalPressed()
    calculator.decimalPressed()
    calculator.numberPressed(5)

    assert(equalDoubles(calculator.displayNumber(), 2.35), calculator.displayNumber())
  }

}
