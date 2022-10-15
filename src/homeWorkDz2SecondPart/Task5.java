package homeWorkDz2SecondPart;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); //количество столбцов и строк
        int[][] a = new int[N][N];
        int i =0;
        int j =0;
        int count = 0;
        boolean response = false;
        if(N>0 && N<100) {
            for ( i = 0; i < a.length; i++) {
                for (j = 0; j < a.length; j++) {
                      a[i][j] = scanner.nextInt();
                }
            }
        }
        int k = (int) a.length / 2;
        for (int l = 0; l < k; l++) {
            if (a[l][l] == a[(a.length - 1) - l][(a.length - 1) - l]) {
                count++;
            } else {
                count--;
            }
        }

        if (count == k) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}


