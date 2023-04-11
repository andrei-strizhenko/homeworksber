package dz1part2;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        if (Math.max(Math.max(a, b), Math.max(b, c)) >= Math.min(a, b) + Math.min(b, c)) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }

    }
}