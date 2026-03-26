package 배열.과제안낸_5597;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] submitted = new boolean[31];

        for (int i = 0; i < 28; i++) {
            int n = Integer.parseInt(br.readLine());
            submitted[n] = true;
        }

        for (int i = 1; i <= 30; i++) {
            if (!submitted[i]) {
                System.out.println(i);
            }
        }
    }
}
