package homeWorkDz2SecondPart;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); //количество столбцов и строк
        int X = scanner.nextInt(); //индекс столбцов
        int Y = scanner.nextInt(); //индекс строк
        int X1 = scanner.nextInt(); //индекс столбцов
        int Y1 = scanner.nextInt(); //индекс строк
        int[][] ai = new int[N][N];
/* Ограничения:
● 0 < N < 100
● 0 <= X1, Y1, X2, Y2 < N
● X1 < X2
● Y1 < Y2
*/
        for (int i = 0; i < ai.length; i++) {
            for (int j = 0; j < ai.length; j++) {
                if (i == X && j >= Y && j <= Y1 || i >= X && i <= X1 && j == Y || i == X1 && j >= Y && j <= Y1 || i >= X && i <= X1 && j == Y1) {
                    ai[i][j] = 1;
                } else {
                    ai[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < ai.length; i++) {
            for (int j = 0; j < ai.length; j++) {
                if (j < ai.length - 1) {
                    System.out.print(ai[j][i] + " ");
                } else {
                    System.out.print(ai[j][i]);
                }
            }
            System.out.println();
        }
    }
}
