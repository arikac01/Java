package StreamAPIOptionalClassParallelSort;
import java.sql.Array;
import java.util.*;
/*
Arrays.parallelSort() Method:

This method is used to perform parallel sorting on arrays.
It automatically determines the optimal number of threads based on
the available CPU cores and the size of the array.
 */
public class ParallelArraySort {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 7, 1, 8, 3, 9, 4, 6};
        System.out.println("Before sorting:" +Arrays.toString(numbers));
        Arrays.parallelSort(numbers);
        System.out.println("After sorting:" +Arrays.toString(numbers));
    }
}
