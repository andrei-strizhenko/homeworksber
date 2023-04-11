package dz2part1;
import java.util.Arrays;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        int[] ai;
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        if (N > 0 && N < 100) {
             ai = new int[N];
            for (int i = 0; i < ai.length; i++) {
                int a = scanner.nextInt();
                if (a > -1000 && a < 1000) {
                    ai[i] = a;
                }
            }
           int [] answer = sortSquares(N,ai);
            for (int j = 0; j < answer.length; j++) {
                System.out.print(answer[j]+" ");
            }
        }
    }

    public static int[] sortSquares(int N, int[] arr) {
        int[] result = new int[N];
        for (int i = 0; i < N; i++) {
            result[i] = arr[i] * arr[i];
        }
        Arrays.sort(result);
        return result;
    }
}
