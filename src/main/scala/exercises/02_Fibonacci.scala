package exercises

object Fibonacci {
  /**
   * Implement the classic Fibonacci sequence, where
   *    fib(1) = 1
   *    fib(2) = 1
   *    fib(n) = fib(n-1) + fib(n-2)
   */
  def fib(n: Int): Int = quick_fib(n)._1

  private[this] def quick_fib(n: Int): (Int, Int) = if (n <= 1)
    (1, 1)
  else {
    val prev = quick_fib(n - 1)
    (prev._2, prev._1 + prev._2)
  }

}