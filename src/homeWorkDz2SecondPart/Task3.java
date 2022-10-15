package homeWorkDz2SecondPart;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); //количество столбцов и строк
        int X = scanner.nextInt(); //индекс столбцов
        int Y = scanner.nextInt(); //индекс строк
        char[][] a = new char[N][N];

        if (N > 4 && N < 100 && X >= 0 && Y < N) {
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a.length; j++) {

                    if (i == X - 1 && j == Y - 2 || i == X - 1 && j == Y + 2 || i == X + 1 && j == Y + 2 ||
                            i == X - 2 && j == Y - 1 || i == X - 2 && j == Y + 1 || i == X + 2 && j == Y + 1 ||
                            i == X + 2 && j == Y - 1 || i == X + 1 && j == Y - 2) {
                        a[i][j] = 'X';
                    } else if (i == X && j == Y) {
                        a[i][j] = 'K';
                    } else {
                        a[i][j] = '0';
                    }
                }
            }
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a.length; j++) {
                    if (j < a.length - 1) {
                        System.out.print(a[j][i] + " ");
                    } else {
                        System.out.print(a[j][i]);
                    }
                }
                System.out.println();
            }
        }
    }
}
