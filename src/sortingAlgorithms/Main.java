package sortingAlgorithms;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {2, 8, 7, 1, 3, 5, 6, 4};
        System.out.println("Before Array: " + Arrays.toString(array));
        HoareQuickSort.hoareQuickSort(array);
        System.out.println("After Array: " + Arrays.toString(array));
    }
}
