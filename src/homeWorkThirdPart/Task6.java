package homeWorkThirdPart;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        int bill;
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        for (int j = 8; j >= 1; j = j / 2) {
            bill = (int) n / j;
            System.out.print(bill + " ");
            n = (int) n % j;
        }
    }
}



