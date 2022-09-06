package homeWorkFirstPart;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        double V;
        if (radius > 0 && radius < 100) {
            V = 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
            System.out.println(V);
        }
    }
}
