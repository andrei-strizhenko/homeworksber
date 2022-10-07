package homeWorkDz2FirstPart;

import java.util.Locale;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        int n = scanner.nextInt();
        if (n > 0 && n < 100) {
            int[] ai = new int[n];
            for (int i = 0; i < ai.length; i++) {
                int a = scanner.nextInt();
                if (a > -1000 && a < 1000) {
                    ai[i] = a;
                }
            }
            int m = scanner.nextInt();
            if (m >= 0 && m < 100) {
                swap(ai, m);
                for (int i = 0; i < ai.length; i++) {
                    System.out.print(ai[i] + " ");
                }
            }
        }
    }

    public static void swap(int[] array, int step) {
        if (step > 0) { // если число step- положительное сдвиг вправо
            for (int i = 0; i < step; i++) {
                int c = array[array.length - 1];
                for (int j = array.length - 1; j > 0; j--) {
                    array[j] = array[j - 1];
                }
                array[0] = c;
            }
        } else { // если число step- отрцательное сдвиг влево
            for (int i = 0; i > step; i--) {
                int c = array[0];
                for (int j = 1; j < array.length; j++) {
                    array[j - 1] = array[j];
                }
                array[array.length - 1] = c;
            }
        }
    }
}


