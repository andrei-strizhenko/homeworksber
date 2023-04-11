package dz2part2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); //количество столбцов и строк
        int column = 0;
        int row = 0;
        int[][] a = new int[N][N];


        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = scanner.nextInt();
            }
        }


        int P = scanner.nextInt(); //число
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                //      a[i][j] = scanner.nextInt();
                if (a[i][j] == P) {
                    row = j;
                    column = i;
                }
            }
        }

        newMatrix(a, row, column);
    }

    public static void newMatrix(int[][] a, int row, int column) {
        int[][] b = new int[a.length-1][a.length-1];
        //     int ln = 0;

        for (int i = 0, ln = 0; ln < a.length - 1; ) {
            if (i != row) {
                for (int j = 0, cn = 0; cn < a.length - 1; j++, cn++) {
                    if (j == column) j++;
                    b[ln][cn] = a[i][j];
                }
                i++;
                ln++;
            } else i++;
        }

        for (int k = 0; k < b.length; k++) {
            for (int l = 0; l < b.length; l++) {
                System.out.print(b[k][l]);
                if(l != b.length-1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}