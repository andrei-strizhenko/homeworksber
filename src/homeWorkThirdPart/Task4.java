package homeWorkThirdPart;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int chislo;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = (int) Math.log10(n) + 1;  //узнаем количество цифр в числе n
        int mem = k;

        if (n > 0 && n < 1000000) {
            for (int i = 1; i <= mem; i++) {
                if (k - 1 >= 0) {
                    chislo = n / ((int) Math.pow(10, k - 1));
                    n = n % ((int) Math.pow(10, k - 1));
                    k--;
                    System.out.println(chislo);
                } else if (k - 1 <= 0) {
                    System.out.println(n % ((int) Math.pow(10, k - 1)));
                }
            }
        }
    }
}


