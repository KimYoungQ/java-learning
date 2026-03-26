package 배열.공바꾸기_10813;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        List<Integer> basket = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            basket.add(i);
        }

        for (int m = 0; m < M; m++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken()) - 1;
            int j = Integer.parseInt(st.nextToken()) - 1;

            Collections.swap(basket, i, j);
        }

        basket.forEach(n -> System.out.print(n + " "));
    }
}
