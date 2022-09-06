package homeWorkSekondPart;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        // (sin^2(x)+
        //cos^2(x) - 1 == 0
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        if ((Math.sin(x) * Math.sin(x)) + (Math.cos(x) * Math.cos(x)) - 1 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
