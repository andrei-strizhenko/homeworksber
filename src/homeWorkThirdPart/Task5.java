package homeWorkThirdPart;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double m = scanner.nextDouble();
        double n = scanner.nextDouble();
        while (m > 0 && n < 10 && n > 0) {
            int o = ((int) Math.floor(m / n)) * (int) n;
            System.out.println((int) m - o);
            break;
        }
    }
}
