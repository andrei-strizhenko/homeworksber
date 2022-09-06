package homeWorkSekondPart;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        double d = b * b - 4 * a * c;
        if (d >= 0) {
            System.out.println("Решение есть");
        } else {
            System.out.println("Решения нет");
        }
    }
}
