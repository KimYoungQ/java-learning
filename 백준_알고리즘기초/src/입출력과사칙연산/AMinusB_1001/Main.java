package 입출력과사칙연산.AMinusB_1001;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println(
                Arrays.stream(new BufferedReader(new InputStreamReader(System.in)).readLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .reduce((a, b) -> a - b)
                        .getAsInt()
        );
    }
}
