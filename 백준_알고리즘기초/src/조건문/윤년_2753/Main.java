package 조건문.윤년_2753;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(br.readLine());

        int result = (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) ? 1 : 0;
        System.out.println(result);

    }
}
