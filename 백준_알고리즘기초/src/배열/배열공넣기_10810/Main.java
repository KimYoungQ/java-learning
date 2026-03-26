package 배열.배열공넣기_10810;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] result = new int[N];

        int i = 0;
        while ( i < M ) {
            int[] arrays = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            for (int j = arrays[0]-1; j <= arrays[1]-1; j++) {
                    result[j] = arrays[2];
            }

            i++;
        }

        Arrays.stream(result).forEach(n -> System.out.print(n + " "));
    }
}
