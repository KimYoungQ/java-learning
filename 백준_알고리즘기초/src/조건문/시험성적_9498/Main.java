package 조건문.시험성적_9498;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String grade = Stream.of(br.readLine())
                .mapToInt(Integer::parseInt)
                .mapToObj(s -> s >= 90 ? "A" :
                        s >= 80 ? "B" :
                                s >= 70 ? "C" :
                                        s >= 60 ? "D" : "F")
                .findFirst()
                .get();

        System.out.println(grade);
    }
}
