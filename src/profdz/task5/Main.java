package profdz.task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        inputN();

    }

    private static void inputN() {
        System.out.println("Введите число n, 0 < n < 100");
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        try {
            if (n > 0 && n < 100) {
                throw new Exception("Успешный ввод");
            } else {
                throw new Exception("Неверный ввод");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
