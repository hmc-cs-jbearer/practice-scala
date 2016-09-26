package exercises

object Palindrome {
  /** 
   *  True if the string is a palindrome, after removing all non-alphabetic 
   *  characters (e.g., spaces, numbers, and punctuation).
   *  
   *  Hint: the Scala collections API is your friend
   *  http://docs.scala-lang.org/overviews/collections/overview.html 
   */
  def isPalindrome(s: String): Boolean = clean(s.toList) == clean(s.toList).reverse

  private[this] def clean(s: List[Char]): List[Char] = s.toList match {
    case List()                => List()
    case c :: cs if c.isLetter => c.toLower :: clean(cs)
    case _ :: cs               => clean(cs)
  }
}