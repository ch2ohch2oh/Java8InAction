# Chapter 1 - Java 8 why should you care?

## Predicate

A predicate represents a boolean-valued function of one argument. 
It is defined as a functional interface.
```
@FunctionalInterface
public interface Predicate<T> {
    ...
    boolean test(T t);
}
```

## Stream-based parallelism

Use parallel stream.

## Default methods

Fix the issue of backward compatibility of adding new methods to an existing interface.
Without default methods, any classes that implement the interface must also add
the implementation of the newly added method, which could be very painful if the 
codebase is large.

## Optional

I believe I have seen something like this in C++. Programming languages
do copy from each other.
