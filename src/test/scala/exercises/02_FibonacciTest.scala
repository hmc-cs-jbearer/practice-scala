package exercises

import Fibonacci.fib
import org.scalatest.FunSuite
import org.scalatest.Matchers
import org.scalacheck.Properties
import org.scalacheck.Prop.forAll
import org.scalacheck.Gen

/**
 * FibonacciTest: check that Fibonacci.fib returns the correct value when
 * evaluated at a few specific points, including the base cases 1 and 2.
 */
class FibonacciTest extends FunSuite with Matchers {
  test("fib(1)") {
    fib(1) should be (1)
  }

  test("fib(2)") {
    fib(2) should be (1)
  }

  test("fib(5)") {
    fib(5) should be (5)
  }
}

/**
 * FibonacciCheck: ensure that Fibonacci.fib satisfies the invariant
 *   fib(n) := fib(n - 1) + fib(n - 2)
 * for many inputs.
 */
object FibonacciCheck extends Properties("Fibonacci") {
  val inputs = Gen.choose(3, 1000)

  property("fib") = forAll(inputs) { n ⇒
    fib(n) == fib(n - 1) + fib(n - 2)
  }
}
