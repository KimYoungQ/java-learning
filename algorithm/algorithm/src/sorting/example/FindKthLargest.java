package algorithm.src.sorting.example;

import java.util.Arrays;

/*
* 배열에서 K번째로 큰 수를 찾으시오.
* */
public class FindKthLargest {

    public static void main(String[] args) {
        int arr[] = {3, 2, 1, 5, 6, 4};
        System.out.println(findKthLargest(arr, 2));
    }

    private static int findKthLargest(int[] arr, int k) {
        Arrays.sort(arr);
        return arr[arr.length - k];
    }
}
