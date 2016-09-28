Scala makes it easy to write functional style code. I like the way this is
encouraged by the language. For example, the ability to write a function that
does not include an explicit return statement subtly encourages the programmer
to think in a functional mindset, by thinking of a function body as an
expression to be evaluated rather than as a sequence of commands to be run.

Scala also makes it easy to write object-oriented code, with `class`es that
behave like Java classes, as well as with `object`s. Where we start to run into
problems, though, is where the functional meets the OOP. Both of these
paradigms have their place, but I'm not sure I like the combination of them. I
prefer Haskell's algebraic types for structured data over OOP-style classes,
especially since they play nicely with pattern matching and general functional
techniques.

This leads to a more general feeling I had when trying to do functional
programming in Scala. Certainly it's good, better than C++, Python, or Java.
But I'm learning Haskell at the same time in CS131, and I couldn't help but
feeling that functional programming in Scala is like Haskell but not quite as
good. For example, it's easier to do pattern matching by just having multiple
definitions of a function with patterns in the arguments, than it is to write
something like
```scala
def do_something(x: Int): String = x match {
    case 0 => "foo"
    ...
    case _ => "bar"
}
```
which is much more verbose. I suppose that this is a tradeoff which arises due
to the fact that Haskell is optimized for functional programming, while Scala's
syntax has to support other paradigms as well. It's still frustrating.

Another notable feature of Scala is its large amount of syntactic sugar. For
example, the procedure for "operator overloading" that we saw in class (define
a method called `+` and then call it in infix notation) lets us write code like
`a + b`, which is just sugar for `a.+(b)`. This is great from a language design
point of view, because it gives the language implementer more control over the
syntax of the language, allowing the implementer to "remove the host flavor",
so that one can implement internal DSLs which don't look remotely like plain
Scala code. On the other hand, the large number of ways to say the same thing
can make it difficult for one who is just trying to program in Scala, rather
than to implement a DSL. As a result, while I would seriously consider using
Scala to implement a DSL, I think I would usually prefer a different language
for more general programming work.