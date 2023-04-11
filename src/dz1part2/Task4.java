package dz1part2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n >= 1 && n <= 5) {
            System.out.println(6 - n);
        } else {
            System.out.println("Ура, выходные!");
        }
    }
}
