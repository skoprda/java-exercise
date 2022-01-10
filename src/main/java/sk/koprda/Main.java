package sk.koprda;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> values = NumberValueGenerator.generateValues(1, 100);
        values.forEach(System.out::println);
    }
}