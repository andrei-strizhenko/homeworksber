package homeWorkFirstPart;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        final double CENTIMETER_IN_AN_INCH = 2.54;
        Scanner scanner = new Scanner(System.in);
        double count = scanner.nextDouble();
        if (count > 0 && count < 1000) {
            double inch = count * CENTIMETER_IN_AN_INCH;
            System.out.println(inch);
        }
    }
}
