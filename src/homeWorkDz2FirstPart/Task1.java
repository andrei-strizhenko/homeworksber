package homeWorkDz2FirstPart;

import java.util.Scanner;
import java.util.Locale;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        int n = scanner.nextInt();
        double[] ai = new double[n];

        for (int i = 0; i < ai.length; i++) {
            double a = scanner.nextDouble();
            ai[i] = (double) a;
        }
        System.out.println(average(ai) / ai.length);
    }

    public static double average(double[] list) {
        double sum = 0;
        for (int j = 0; j < list.length; j++) {
            sum = sum + list[j];
        }
        return sum;
    }
}