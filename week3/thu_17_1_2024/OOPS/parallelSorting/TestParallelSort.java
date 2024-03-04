package parallelSorting;

import java.util.Arrays;
import java.util.concurrent.RecursiveTask;
import java.util.concurrent.ForkJoinPool;


public class TestParallelSort {
    public static void main(String[] args) {
        int[] array = {5, 3, 8, 4, 2, 7, 1, 6};

        ForkJoinPool forkJoinPool = new ForkJoinPool();
        int[] sortedArray = forkJoinPool.invoke(new ParallelMergeSort(array, 0, array.length - 1));

        System.out.println("Sorted Array: " + Arrays.toString(sortedArray));
    }
}
