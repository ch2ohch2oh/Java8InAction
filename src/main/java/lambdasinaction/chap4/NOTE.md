# Chapter 4 - Introducing streams

## What are streams?

Example
```
List<String> lowCaloricDishesName = 
    menu.stream()
        .filter(d -> d.getCalories() < 40)
        .sorted(comparing(Dish::getCalories))
        .map(Dish::getName)
        .collect(toList())
```

The code is written in a declarative way.

Some libraries to manipulate Java collections.
- Gauva: Google core libraries for Java
- Apache Commons Collections
- lambdaj (not actively developed)

Main features of stream API in Java 8.
- Declarative
- Composable
- Parallelizable

## Getting started with streams

```
public interface Stream<T> extends BasedStream<T, Stream<T>> 
```

## Streams vs collections

A stream can only be traversed once.

Iteration over a stream is internal, which means you do not need to
explicitly write a for loop. Since the user does not write 
the loop, it is easy to let Java parallelize.

## Stream operations

There are two types of operations:
- Intermediate operations: `filter, map, limit, sorted, distinct` etc.
- Terminal operations: `collect, forEach, count` etc.

Intermediate operations return a stream while terminal operations return a result.


