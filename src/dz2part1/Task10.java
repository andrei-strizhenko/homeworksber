package dz2part1;

import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        guessValue();
    }

    public static void guessValue() {
        Random random = new Random(0);
        int value = random.nextInt(1000);
        while (true) {
            Scanner reader = new Scanner(System.in, StandardCharsets.UTF_8);
            System.out.println("Ввести число: ");
            int n = reader.nextInt();
            if (n < 0) {
                return;
            }
            else if (n < value) {
                System.out.println("Это число меньше загаданного.");
            }
            else if (n > value) {
                System.out.println("Это число больше загаданного.");
            }
            else {
                System.out.println("Победа!");
                return;
            }
        }
    }
}
