package dz2part2;


import java.util.Scanner;


public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); //количество столбцов
        int M = scanner.nextInt(); // количество строк


        if (N > 0 && N < 100 && M > 0 && M < 100) {
            int[][] a = new int[M][N];
            int[] simple = new int[N];
            int result = 0;
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; ++j) {
                    a[i][j] = scanner.nextInt();
                    simple[j] = a[i][j];
                }
            }

            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; ++j) {
                    simple[j] = a[i][j];
                    result = minValue(simple);
                }
                System.out.print(result + " ");
            }
        }
    }

    private static int minValue(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

        }
        return min;
    }
}











