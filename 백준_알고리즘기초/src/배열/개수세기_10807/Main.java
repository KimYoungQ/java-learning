package 배열.개수세기_10807;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int [] integers = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int v = Integer.parseInt(br.readLine());

        long result = Arrays.stream(integers)
                .filter(x -> x == v)
                .count();

        System.out.println(result);
    }
}
`