package dz2part2;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        if (N > 0 && N < 1000000) {
            int N1 = sum(N);
            System.out.println(N1);
        }
    }

    public static int sum(int N1) {
        if (N1 / 10 >= 1) {
            int temp = N1 % 10;
            int digit = N1 / 10;
            return temp + sum(digit);
        } else {
            return N1;
        }

    }
}
