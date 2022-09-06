package homeWorkFirstPart;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        final double KILOMETERS_IN_AN_MILE = 1.60934;
        Scanner scanner = new Scanner(System.in);
        double count = scanner.nextLong();
        if (count > 0 && count < 1000) {
            double inch = (count / KILOMETERS_IN_AN_MILE);
            System.out.println(inch);
        }
    }
}
