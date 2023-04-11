package dz2part1;

import java.util.Locale;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        int n = scanner.nextInt();
        int[] ai = new int[n];
        for (int i = 0; i < ai.length; i++) {
            int a = scanner.nextInt();
            ai[i] = (int) a;
        }
        int m = scanner.nextInt();
        int[] aj = new int[m];
        for (int j = 0; j < aj.length; j++) {
            int b = scanner.nextInt();
            aj[j] = (int) b;
        }
        System.out.println(ecualsArray(ai,aj));
    }

    public static boolean ecualsArray(int[] list, int[] list2) {
        double sum = 0;
        for (int k = 0; k < list.length; k++) {
            for (int l = 0; l < list2.length; l++) {
                if (list.length == list2.length && list[k] == list2[l]) {
                    return true;
                } else {
                    return false;
                }
            }

        }
        return false;
    }
}