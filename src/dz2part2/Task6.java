package dz2part2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int K = scanner.nextInt();
        int[][] a = new int[8][4];
        a[0][0] = A;
        a[0][1] = B;
        a[0][2] = C;
        a[0][3] = K;
        int count = 0;
        for (int i = 1; i < 8; i++) {
            for (int j = 0; j < 4; j++) {
                a[i][j] = scanner.nextInt();
            }
        }

        for (int k = 0; k < 4; k++) {
            if (a[0][k] >= check(a, k)) {
                count++;
            }
        }

        if (count == 4) {
            System.out.println("Отлично");
        } else {
            System.out.println("Нужно есть поменьше");
        }


    }


    public static int check(int[][] b, int col) {
        int sum = 0;
        int count = 0;

        for (int j = 1; j < 8; j++) {
            sum = sum + b[j][col];
        }
        return sum;
    }
}











