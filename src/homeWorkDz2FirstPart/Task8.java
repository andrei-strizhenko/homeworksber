package homeWorkDz2FirstPart;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        int[] ai = new int[0];
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
        }
        int M = scanner.nextInt();
        if (M > -1000 && M < 1000) {
            System.out.println(nearest(N, ai, M));
        }
    }

        public static int nearest(int N, int[] arr, int value) {
            int nearest = 0;
            int minDiff = Integer.MAX_VALUE;

            for (int i = 0; i < N; i++) {
                int currentDiff = Math.abs(arr[i] - value);
                if (currentDiff < minDiff) {
                    nearest = arr[i];
                    minDiff = currentDiff;
                }
                else if (currentDiff == minDiff) {
                    if(nearest < arr[i]){
                        nearest = arr[i];
                    }
                }
            }
            return nearest;
        }


}
