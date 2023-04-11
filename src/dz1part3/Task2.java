package dz1part3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int m = 0, n = 0;
        int sum = 0, next = 0;
        Scanner scanner = new Scanner(System.in);
        m = scanner.nextInt();
        n = scanner.nextInt();
        if (m + 1 == n) {
            sum = m + n;
            System.out.println(sum);// не трогать
        } else {
            sum = m + n;
            for (int i = m + 1; i < n; ++i) {
                sum = sum + i;
            }
            System.out.println(sum);
        }
    }
}
