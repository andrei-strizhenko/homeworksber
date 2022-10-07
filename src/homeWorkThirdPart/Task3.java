package homeWorkThirdPart;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int s = 0;
        if (m > 0 && n > 0 && n < 10) {
            for (int i = 1; i <= n; i++) {
                s = s + (int) Math.pow(m, i);
            }
        }
        System.out.println(s);
    }
}

