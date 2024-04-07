package StreamAPIOptionalClassParallelSort;

public class Notes {
}
//StreamAPI, Optional Class, Parallel sort, String Joiner, Date and Time API
//with the help of stream api, find out even odd numbers.
//more than or equal to 5. ------filter
// add 10 to individual element
//multiply by 2 in individual element ---------map
//find out the count
//find out the sum
//Minimum element, Max
//Sorting
//duplicate, unique elements
//find out the third highest, third lowest
//employee list - find out the highest salary, find the employee by city or department
//by id
//java guides

/*
The Stream API in Java provides a powerful way to process collections of
objects in a functional style.

Stream Creation:

->Streams can be created from collections, arrays, or directly using
stream-generating methods.

Functional Operations:

->Streams support a wide range of intermediate and terminal operations
to perform data processing.

->Intermediate operations include "filter(), map(), sorted(), distinct(), limit(), skip()".

->Terminal operations include "forEach(), toArray(), collect(), reduce(),
 count(), min(), max(), anyMatch(), allMatch(), noneMatch(), findFirst(), findAny().

->shortCircuit Operations: anyMatch(), allMatch(), noneMatch(), findFirst(), findAny(), limit();


Lazy Evaluation:

->Stream operations are lazily evaluated, meaning intermediate operations
are only performed when needed.
->This allows for efficient processing, especially on large datasets,
as only necessary elements are processed.

Immutability:

->Streams are immutable, meaning they do not modify the original data source.
->Each intermediate operation returns a new stream, leaving the original stream unchanged.

Pipelines:

->Stream operations can be chained together to form pipelines,
where each operation processes the data sequentially.
->Pipelines are composed of zero or more intermediate operations
followed by a terminal operation.

Parallel Processing:

->Streams support parallel processing using the parallel() method,
which allows operations to be performed concurrently across multiple threads.
->This can improve performance for computationally intensive tasks on multi-core processors.

Integration with Functional Interfaces:

->Streams seamlessly integrate with functional interfaces such as
Predicate, Function, Consumer, etc., enabling concise and expressive code.

Null-Safe:

->Stream operations are null-safe, meaning they gracefully handle null
elements in collections without throwing NullPointerExceptions.

Reduction:

->Reduction operations, such as reduce and collect, allow streams to be
aggregated into single values or collections.
->These operations are commonly used to calculate sums, find maximums, or
collect elements into lists.

Resource Management:

->Streams do not require explicit resource management, as they
automatically handle resource cleanup (e.g., closing file streams) using try-with-resources.



--------------------------------------------------------------------------------------------------

Optional class: A container object that may or may not contain a non-null value,
providing a null-safe way to handle potentially absent values in Java.

Purpose: Represents a value that may or may not be present.
Creation: Use Optional.of(value) for non-null values, Optional.ofNullable(value)
for nullable values, and Optional.empty() for no value.
Accessing Values: Retrieve value with orElse(defaultValue) or orElseGet(supplier).
Throw exception with orElseThrow(exceptionSupplier) if value is absent.
Functional Operations: Use map, flatMap, and filter for transformations and filtering.
Avoiding Null Checks: Provides null-safe access to values, reducing NullPointerExceptions.
Use Cases: Often used as return types for methods that may or may not return a value,
and in stream processing.
Immutable: Instances are immutable once created.

------------------------------------------------------------------------------------------------
Parallel Array Sort

Before Java 8, sorting in Java was done using single-threaded algorithms,
which could become a bottleneck when sorting large datasets.

->Parallel sorting leverages the Fork/Join framework introduced in Java 7 to divide
the sorting task into smaller subtasks and distribute them across multiple threads.
->Each thread works on sorting a portion of the array independently,
and once all threads have completed their tasks, the sorted subarrays are
merged to produce the final sorted result.

Here's how parallel sorting works in Java 8:

Array Splitting: The input array to be sorted is divided into smaller chunks.
Each chunk represents a portion of the array to be sorted.

Sorting Subarrays: Each thread sorts its assigned subarray using a sorting
algorithm such as Quicksort, Mergesort, or Timsort.

Concurrent Sorting: Multiple threads work concurrently to sort their
respective subarrays. Each thread operates independently without interfering with
the sorting performed by other threads.

Merging Sorted Subarrays: Once all threads have completed sorting their subarrays,
the sorted subarrays are merged together to produce the final sorted array.
This merge operation is typically done using an efficient merging algorithm.

Final Sorted Result: The merged sorted array is the final result of the
parallel sorting operation.
 */