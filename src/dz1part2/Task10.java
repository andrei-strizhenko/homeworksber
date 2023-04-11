package dz1part2;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        if (Math.log(Math.pow(Math.E, n)) == n) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
