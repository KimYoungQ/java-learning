package algorithm.src.sorting.quickSort;

import java.util.Arrays;

public class QuickSort {

    public static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {

            // Step 1: 파티션 - pivot의 올바른 위치를 찾고 배열을 분할
            int pivotIndex = partition(arr, low, high);

            // Step 2: 피벗 왼쪽 부분 재귀 정렬 (pivot보다 작은 값들)
            quickSort(arr, low, pivotIndex -1);

            // Step 3: 피벗 오른쪽 부분 재귀 정렬 (pivot보다 큰 값들)
            quickSort(arr, pivotIndex +1, high);
        }
    }

    /**
     * Lomuto Partition Scheme
     * <p>
     * 핵심: 마지막 원소를 pivot으로 선택
     * i는 "pivot보다 작은 영역"의 끝을 추적
     * <p>
     * 배열 구조: [low ... i | i+1 ... j-1 | j ... high-1 | pivot]
     * ≤ pivot    > pivot       미확인          pivot
     */
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low -1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);  // 작은 값을 왼쪽 영역으로 이동
            }
        }

        // pivot을 올바른 위치(i+1)로 이동
        swap(arr, i + 1, high);
        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};

        System.out.println("정렬 전: " + Arrays.toString(arr));
        quickSort(arr);
        System.out.println("정렬 후: " + Arrays.toString(arr));
    }
}
