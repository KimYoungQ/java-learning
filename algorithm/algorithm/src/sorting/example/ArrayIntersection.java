package algorithm.src.sorting.example;

import java.util.ArrayList;
import java.util.List;

/**
 * 두 정렬된 배열의 교집합을 구하시오.
 * 입력: arr1 = [1, 2, 2, 3, 4], arr2 = [2, 2, 3, 5]
 * 출력: [2, 2, 3]
 */
public class ArrayIntersection {

    public static List<Integer> intersection(int[] arr1, int[] arr2) {
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                result.add(arr1[i]);
                i++;
                j++;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 4};
        int[] arr2 = {2, 2, 3, 5};

        System.out.println(intersection(arr1, arr2));
    }
}
