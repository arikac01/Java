package DefaultStaticMethodReferences;

public class MethodReferencesNotes {
}
/*
Method references in Java provide a concise way to refer to methods
without invoking them directly. They are often used as lambda expressions to pass behavior as arguments
to higher-order functions such as map(), filter(), and forEach() in the Stream API.
Method references help improve code readability and reduce boilerplate.

There are four types of method references:

-> Reference to a Static Method: ClassName::staticMethodName
Example: String::valueOf or Integer::parseInt

-> Reference to an Instance Method of a Particular Object: objectReference::instanceMethodName
Example: System.out::println

-> Reference to an Instance Method of an Arbitrary Object of a Particular Type: ClassName::instanceMethodName
Example: String::length

->Reference to a Constructor: ClassName::new
Example: ArrayList::new

Lambda expressions and method references are both features introduced in Java 8
that facilitate the implementation of functional programming concepts.
While they serve similar purposes, they differ in their syntax and usage.

Syntax:

Lambda Expressions: Lambda expressions use the -> operator to separate the parameters
from the body of the lambda expression.
Method References: Method references use the :: operator to reference a method without
invoking it directly.

Usage:

Lambda Expressions: Lambda expressions are used to define anonymous functions
or inline implementations of functional interfaces.
Method References: Method references are used to refer to existing methods,
either static methods, instance methods, or constructors, without invoking them directly.

Parameter Passing:

Lambda Expressions: In lambda expressions, you can specify parameters explicitly within
the lambda syntax.
Method References: Method references do not allow you to specify parameters explicitly;
instead, they use the parameters defined by the functional interface to which they are assigned.

Readability:

Lambda Expressions: Lambda expressions can make code more concise and expressive,
especially for simple operations.
Method References: Method references can enhance code readability by providing a
more direct and recognizable way to refer to existing methods.

Applicability:

Lambda Expressions: Lambda expressions are suitable for defining inline implementations
of functional interfaces, especially for short and simple operations.
Method References: Method references are preferable when you want to directly refer
to existing methods, promoting code reuse and improving readability.

Type Inference:

Lambda Expressions: Lambda expressions require type inference to determine the types of
the parameters and the return type.
Method References: Method references rely on the context in which they are used to infer
the types of the parameters and the return type.

lambda expressions are used to define inline implementations of functional interfaces,
method references provide a more direct way to refer to existing methods.
The choice between lambda expressions and method references depends on the specific
use case and preference for code style and readability.

 */
