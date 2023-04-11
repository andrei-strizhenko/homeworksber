package dz1part1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        if (a > 0 && b < 100) {
            double x = Math.sqrt((a * a + b * b) / 2);
            System.out.println(x);
        }
    }
}
