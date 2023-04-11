package dz1part1;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        final int DAYS_PER_MONTH = 30;
        Scanner scanner = new Scanner(System.in);
        double count = scanner.nextDouble();
        if (count > 0 && count < 100000) {
            double a = count / DAYS_PER_MONTH;
            System.out.println(a);
        }

    }
}
