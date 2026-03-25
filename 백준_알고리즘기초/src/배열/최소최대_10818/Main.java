package 배열.최소최대_10818;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arrays = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int max = Arrays.stream(arrays).max().getAsInt();
        int min = Arrays.stream(arrays).min().getAsInt();

        System.out.printf("%d %d", min, max);
    }
}
