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

