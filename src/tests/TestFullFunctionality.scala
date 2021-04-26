package tests

import org.scalatest.FunSuite
import calculator.model.Calculator

class TestFullFunctionality extends FunSuite{

  val EPSILON: Double = 0.000001

  def equalDoubles(d1: Double, d2: Double): Boolean = {
    (d1 - d2).abs < EPSILON
  }

  test("Testing full functionality of calculator"){
    val calculator: Calculator = new Calculator

    assert(equalDoubles(calculator.displayNumber(), 0.0), calculator.displayNumber())

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
    calculator.numberPressed(3)
    calculator.addPressed()
    calculator.numberPressed(3)
    calculator.addPressed()
    calculator.numberPressed(3)
    calculator.equalsPressed()

    assert(equalDoubles(calculator.displayNumber(), 9.0), calculator.displayNumber())

    calculator.clearPressed()
    calculator.numberPressed(3)
    calculator.addPressed()
    calculator.numberPressed(3)
    calculator.addPressed()
    calculator.numberPressed(3)
    calculator.multiplyPressed()
    calculator.numberPressed(5)
    calculator.equalsPressed()

    assert(equalDoubles(calculator.displayNumber(), 45.0), calculator.displayNumber())

    calculator.clearPressed()
    calculator.numberPressed(3)
    calculator.addPressed()
    calculator.numberPressed(3)
    calculator.addPressed()
    calculator.numberPressed(3)
    calculator.decimalPressed()
    calculator.numberPressed(5) //9.5
    calculator.addPressed()
    calculator.decimalPressed()
    calculator.numberPressed(5)
    calculator.equalsPressed()
    //calculator.equalsPressed()

    assert(equalDoubles(calculator.displayNumber(), 10.0), calculator.displayNumber())

    calculator.clearPressed()
    calculator.clearPressed()
    calculator.clearPressed()

    assert(equalDoubles(calculator.displayNumber(), 0.0), calculator.displayNumber())

    calculator.numberPressed(1)
    calculator.numberPressed(1)
    calculator.addPressed()
    calculator.numberPressed(2)
    calculator.equalsPressed()

    assert(equalDoubles(calculator.displayNumber(), 13.0), calculator.displayNumber())

    calculator.addPressed()
    calculator.numberPressed(1)
    calculator.equalsPressed()

    assert(equalDoubles(calculator.displayNumber(), 14.0), calculator.displayNumber())

    calculator.clearPressed()
    calculator.numberPressed(1)
    calculator.addPressed()
    calculator.numberPressed(1)
    calculator.addPressed()
    calculator.numberPressed(1)
    calculator.multiplyPressed()
    calculator.numberPressed(2)
    calculator.equalsPressed()

    assert(equalDoubles(calculator.displayNumber(), 6.0), calculator.displayNumber())

    calculator.clearPressed()
    calculator.numberPressed(2)
    calculator.addPressed()
    calculator.subtractPressed()
    calculator.numberPressed(1)
    calculator.equalsPressed()

    assert(equalDoubles(calculator.displayNumber(), 1.0), calculator.displayNumber())

  }
}
