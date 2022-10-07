package homeWorkDz2FirstPart;

import java.util.Locale;
import java.util.Scanner;

public class Task4 {
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
            int count = 1;

            for (int i = 0; i < ai.length; i++) {
                for (int j = i + 1; j < ai.length; j++) {
                    if (ai[i] == ai[j]) {
                        count++;
                    }
                }
                if (count > 1) {
                    System.out.println(count + " " + ai[i]);
                    i = i + count - 1;
                } else {
                    System.out.println(count + " " + ai[i]);
                    count = 0;
                }
                count = 1;
            }
        }
    }
}





