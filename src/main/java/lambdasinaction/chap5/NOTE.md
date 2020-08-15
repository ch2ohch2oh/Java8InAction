# Chapter 5 - Working with streams

## Filtering and slicing

- `filter`
- `distinct`
- `limit`
- `skip`

## Mapping

- `map`
- `flatMap`

Function signature of `flatMap`:
```
<R> Stream<R> flatMap(Function<? super T, > extends Stream<? extends R>> mapper)
```

## Finding and mapping

- `anyMatch`
- `allMatch`
- `noneMatch`
- `findAny`

Note `findAny` returns an `Optional`. Selective methods for `Optional`:
```
boolean isPresent()
void ifPresent(Consumer<T> consumer)
T get()
T orElse(T other)
```

## Reducing

An `Optional` is returned if no initial value is supplied.

The lambda passed to the `reduce` cannot change state and the operation needs 
to be associative so that it can be executed in any order (or in parallel).

## Building streams

Iterate
```
Stream.iterate(0, n -> n + 2)
    .limit(10)
    .forEach(System.out::println);
```

Generate (from a `Supplier`)