package dz1part1;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        if (count > 9 && count < 100) {
            int b = count / 10;
            int c = count % 10;
            if (c != 0) {
                System.out.println(c * 10 + b);
            } else {
                System.out.println("0"+ b);
            }

        }
    }
}
