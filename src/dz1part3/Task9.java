package dz1part3;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int i = 0;
        n = scanner.nextInt();
        if (n < 0) {
            while (n < 0) {
                n = scanner.nextInt();
                i = i + 1;
            }
        } else {
            System.out.println(0);
            return;
        }
        System.out.println(i);
    }

}



