package homeWorkSekondPart;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        if (a > b && b > c && a > 0 && b > 0 && c > 0 && a < 100 && b < 100 && c < 100) {
            System.out.println("Петя, пора трудится");
        } else if (a < 100 && b < 100 && c < 100){
            System.out.println("Петя молодец!");
        }


    }
}
