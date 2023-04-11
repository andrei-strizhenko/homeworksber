package dz1part3;

import java.util.*;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int p = scanner.nextInt();
        int a = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            a = scanner.nextInt();
            if (a > p) {
                sum = sum + a;
            }
        }
        System.out.print(sum);
    }
}

