package dz2part2;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        if (N > 0 && N < 1000000) {
            System.out.println(recursion(N));
        }
    }

    public static int recursion(int a) {
        if (a < 10) {
            return a;
        }
        else {
            System.out.print(a % 10 + " ");
            return recursion(a / 10);
        }
    }
}
