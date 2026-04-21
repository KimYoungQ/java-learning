package 로또_6603_백트래킹;

import java.util.*;

public class Main {
    static int k;
    static int[] arr;
    static int[] result = new int[6];

    static void dfs(int start, int depth) {
        if (depth == 6) {
            for (int i = 0; i < 6; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = start; i < k; i++) {
            result[depth] = arr[i];
            dfs(i + 1, depth + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean first = true;

        while (true) {
            k = sc.nextInt();
            if (k == 0) break;

            arr = new int[k];

            for (int i = 0; i < k; i++) {
                arr[i] = sc.nextInt();
            }

            if (!first) {
                System.out.println();
            }
            first = false;

            dfs(0, 0);
        }
    }
}