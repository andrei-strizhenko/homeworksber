package dz1part2;


import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        if (x > -1000 && x < 1000) {
            double s = 0;
            s = Math.round(((Math.sin(x) * Math.sin(x)) + (Math.cos(x) * Math.cos(x)) - 1));


            if (s / 100 * 100 == 0) {

                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }
    }
}
