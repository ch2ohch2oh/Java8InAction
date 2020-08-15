# Chapter 3 - Lambda expressions

Some features of lambda expressions:
- Anonymous
- Function
- Passed around
- Concise

Here is the structure of lambda function:
```
(list of parameters) -> {function body}
```

## Where and how to use lambdas?

Lambda expressions can be used in the context of a **functional interface**.
Then what is a functional interface? A functional interface is an interface
with only **one** abstract method.

Some examples of functional interface.
```
public interface Comparator<T> {
    int compare(T a, T b);
}

public interface Runnable {
    void run();
}

public interface Callable<T> {
    V call();
}
```

An interface is **still** a functional interface if it has many default methods
as long as it specifies only one abstract method.

We can use a lambda function where a functional interface is required.


## Function descriptor

A short-hand to summarize the type of the parameters and return value of 
a function. Some examples are listed below.

Functional interface | Function descriptor
---------------------|--------------------
`Predicate<T>`       | `T -> boolean`
`Consumer<T>`        | `T -> void`
`Function<T, R>`     | `T -> R`
`Supplier<T>`        | `() -> T`

## Type checking

The type of lambda is deduced from the context. You cannot assign a 
lambda to an `Object` because it is not a functional interface.

## Capturing lambdas

Lambdas are allowed to capture instance variables and static variables 
without restrictions. However, local variables have to be declared final or 
effectively final. Thus you cannot modify the (outside) local variables within a
lambda.

## Method reference

An example of method reference.

Using lambda:

```Java
(Apple a) -> a.getWeight()
```

Using method reference:

```Java
Apple::getWeight
```

There are three types of method references.

1. A method reference to a static method.
2. A method reference to an instance method of an arbitrary **type**.
3. A method reference to an instance method of an existing **object**.

```Java
(args) -> className.staticMethod(args)
ClassName::staticMethod

(arg0, rest) -> arg0.instanceMethod(rest)
ClassName::instanceMethod

(args) -> expr.instanceMethod(args)
expr::instanceMethod
```

The compiler will check whether a given method reference is compatible with a given functional interface.

### Constructor reference

An example: 

```Java
Supplier<Apple> c1 = Apple::new;
Apple a1 = c1.get();
```

is the same as

```Java
Supplier<Apple> c1 = () -> new Apple();
Apple a1 = c1.get();
```






