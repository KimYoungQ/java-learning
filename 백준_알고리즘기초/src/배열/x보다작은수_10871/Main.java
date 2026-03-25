package 배열.x보다작은수_10871;

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
        int X = Integer.parseInt(st.nextToken());

        Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .filter(num -> num < X)
                .forEach(num -> System.out.print(num + " "));
    }
}
