package algorithm.src.sorting.example;

import java.util.Arrays;

/**
 * 문제: 정수를 이어 붙여 만들 수 있는 가장 큰 수를 구하시오.
 */
public class LargestNumber {
    public static String solution(int[] numbers) {
        String[] arr = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(arr, (a, b) -> (b+a).compareTo(a+b));

        if (arr[0].equals("0")) return "0";

        StringBuilder sb = new StringBuilder();
        for (String s : arr) sb.append(s);
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{6, 10, 2}));       // "6210"
        System.out.println(solution(new int[]{3, 30, 34, 5, 9})); // "9534330"
    }
}
