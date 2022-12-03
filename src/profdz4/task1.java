package profdz4;

import java.util.stream.IntStream;

public class task1 {
    public static void main(String[] args) {
        // суммируем четные числа
        int sumEvenNumber;
        sumEvenNumber = IntStream.range(0, 101)
                .filter(x -> x % 2 == 0)
                .sum();
        System.out.println(sumEvenNumber);
    }
}