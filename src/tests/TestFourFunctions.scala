package tests

import org.scalatest._
import calculator.model.Calculator

class TestFourFunctions extends FunSuite {

  val EPSILON: Double = 0.000001

  def equalDoubles(d1: Double, d2: Double): Boolean = {
    (d1 - d2).abs < EPSILON
  }

  test("Testing to see if all four functions on the calculator work"){

    val calculator: Calculator = new Calculator

    assert(equalDoubles(calculator.displayNumber(), 0.0), calculator.displayNumber())

    calculator.numberPressed(1)
    calculator.addPressed()
    calculator.numberPressed(2)
    calculator.equalsPressed()

    assert(equalDoubles(calculator.displayNumber(), 3.0), calculator.displayNumber())

    calculator.clearPressed()
    calculator.numberPressed(4)
    calculator.numberPressed(0)
    calculator.subtractPressed()
    calculator.numberPressed(5)
    calculator.numberPressed(0)
    calculator.equalsPressed()

    assert(equalDoubles(calculator.displayNumber(), -10.0), calculator.displayNumber())

    calculator.clearPressed()
    calculator.numberPressed(8)
    calculator.dividePressed()
    calculator.numberPressed(2)
    calculator.equalsPressed()

    assert(equalDoubles(calculator.displayNumber(), 4.0), calculator.displayNumber())

    calculator.clearPressed()
    calculator.numberPressed(8)
    calculator.multiplyPressed()
    calculator.numberPressed(2)
    calculator.equalsPressed()

    assert(equalDoubles(calculator.displayNumber(), 16.0), calculator.displayNumber())

    calculator.clearPressed()
    calculator.numberPressed(8)
    calculator.decimalPressed()
    calculator.numberPressed(5)
    calculator.multiplyPressed()
    calculator.numberPressed(2)
    calculator.decimalPressed()
    calculator.numberPressed(5)
    calculator.equalsPressed()

    assert(equalDoubles(calculator.displayNumber(), 21.25), calculator.displayNumber())

    calculator.clearPressed()
    calculator.numberPressed(8)
    calculator.decimalPressed()
    calculator.numberPressed(5)
    calculator.dividePressed()
    calculator.numberPressed(2)
    calculator.decimalPressed()
    calculator.numberPressed(5)
    calculator.equalsPressed()

    assert(equalDoubles(calculator.displayNumber(), 3.4), calculator.displayNumber())

    calculator.clearPressed()
    calculator.numberPressed(8)
    calculator.decimalPressed()
    calculator.numberPressed(5)
    calculator.subtractPressed()
    calculator.numberPressed(2)
    calculator.decimalPressed()
    calculator.numberPressed(5)
    calculator.equalsPressed()

    assert(equalDoubles(calculator.displayNumber(), 6.0), calculator.displayNumber())

    calculator.clearPressed()
    calculator.numberPressed(8)
    calculator.decimalPressed()
    calculator.numberPressed(5)
    calculator.addPressed()
    calculator.numberPressed(2)
    calculator.decimalPressed()
    calculator.numberPressed(5)
    calculator.equalsPressed()

    assert(equalDoubles(calculator.displayNumber(), 11.0), calculator.displayNumber())

    calculator.clearPressed()
    calculator.numberPressed(2)
    calculator.numberPressed(5)
    calculator.dividePressed()
    calculator.numberPressed(5)
    calculator.equalsPressed()

    assert(equalDoubles(calculator.displayNumber(), 5.0), calculator.displayNumber())

    calculator.clearPressed()
    calculator.numberPressed(1)
    calculator.decimalPressed()
    calculator.decimalPressed()
    calculator.numberPressed(5)
    calculator.addPressed()
    calculator.decimalPressed()
    calculator.numberPressed(5)
    calculator.equalsPressed()

    assert(equalDoubles(calculator.displayNumber(), 2.0), calculator.displayNumber())

    calculator.clearPressed()
    calculator.numberPressed(5)
    calculator.numberPressed(0)
    calculator.decimalPressed()
    calculator.numberPressed(5)
    calculator.addPressed()
    calculator.numberPressed(5)
    calculator.numberPressed(0)
    calculator.decimalPressed()
    calculator.numberPressed(5)
    calculator.equalsPressed()

    assert(equalDoubles(calculator.displayNumber(), 101.0), calculator.displayNumber())

    calculator.clearPressed()
    calculator.numberPressed(5)
    calculator.numberPressed(0)
    calculator.decimalPressed()
    calculator.numberPressed(5)
    calculator.addPressed()
    calculator.numberPressed(5)
    calculator.numberPressed(0)
    calculator.decimalPressed()
    calculator.numberPressed(5)
    calculator.equalsPressed()
    calculator.addPressed()
    calculator.numberPressed(1)
    calculator.decimalPressed()
    calculator.numberPressed(5)
    calculator.equalsPressed()

    assert(equalDoubles(calculator.displayNumber(), 102.5), calculator.displayNumber())

    calculator.clearPressed()
    calculator.numberPressed(1)
    calculator.multiplyPressed()
    calculator.numberPressed(8)
    calculator.decimalPressed()
    calculator.decimalPressed()
    calculator.numberPressed(5)
    calculator.equalsPressed()

    assert(equalDoubles(calculator.displayNumber(), 8.5), calculator.displayNumber())

    calculator.clearPressed()
    calculator.numberPressed(1)
    calculator.decimalPressed()
    calculator.decimalPressed()
    calculator.numberPressed(2)
    calculator.decimalPressed()
    calculator.addPressed()
    calculator.numberPressed(4)
    calculator.decimalPressed()
    calculator.numberPressed(3)
    calculator.equalsPressed()

    assert(equalDoubles(calculator.displayNumber(), 5.5), calculator.displayNumber())

    calculator.clearPressed()
    calculator.numberPressed(1)
    calculator.decimalPressed()
    calculator.decimalPressed()
    calculator.numberPressed(2)
    calculator.decimalPressed()
    calculator.addPressed()
    calculator.decimalPressed()
    calculator.numberPressed(3)
    calculator.equalsPressed()

    assert(equalDoubles(calculator.displayNumber(), 1.5), calculator.displayNumber())
  }

}
