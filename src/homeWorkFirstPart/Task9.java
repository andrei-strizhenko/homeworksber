package homeWorkFirstPart;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        if (n > 0 && n < 100000 && n > k) {
            if (k > 0 && k < 1000) {
                System.out.println(n / k);
            }

        }
    }
}

