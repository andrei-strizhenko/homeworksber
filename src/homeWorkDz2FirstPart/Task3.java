package homeWorkDz2FirstPart;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        int n = scanner.nextInt();
        int[] ai = new int[n];
        for (int i = 0; i < ai.length; i++) {
            int a = scanner.nextInt();
            ai[i] = (int) a;
        }
        int x = scanner.nextInt();
        for (int j = 0; j < ai.length; j++) {
            if (x > ai[j] && x < ai[j + 1]) {
                System.out.println(j = j + 1);
            } else if (x == ai[j]) {
                if (x == ai[j++]) {
                    System.out.println(j = j + 1);
                }
            }
        }
    }
}

