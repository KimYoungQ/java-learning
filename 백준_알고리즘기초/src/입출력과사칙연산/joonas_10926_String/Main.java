package 입출력과사칙연산.joonas_10926_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        Stream.of(new BufferedReader(new InputStreamReader(System.in)).readLine())
                    .map(s -> s + "??!")
                    .forEach(System.out::println);
    }
}
