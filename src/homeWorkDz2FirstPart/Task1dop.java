package homeWorkDz2FirstPart;
import org.apache.commons.lang3.RandomStringUtils;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Task1dop {
    public static void main(String[] args) {
        generatePass();
    }

    public static void generatePass() {
        int N = Integer.MIN_VALUE;
        while (true) {
            if (N < 8) {
                if (N != Integer.MIN_VALUE) {
                    System.out.printf("Пароль с %d количеством символов небезопасен\n", N);
                }
                Scanner reader = new Scanner(System.in, StandardCharsets.UTF_8);
                System.out.println("Ввести количество символов в пароле: ");
                N = reader.nextInt();
            }
            else {
               System.out.println(RandomStringUtils.randomAscii(N));
                break;
            }
        }
    }
}
