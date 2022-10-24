package dz3part1.task7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длины 3 сторон треугольника от 0 до 10: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        if (a > 0 && a < 10 && b > 0 && b < 10 && c > 0 && c < 10) {
            TriangleChecker triangleChecker = new TriangleChecker();
            triangleChecker.setA(a);
            triangleChecker.setB(b);
            triangleChecker.setC(c);
            TriangleChecker.Checker(triangleChecker.getA(), triangleChecker.getB(), triangleChecker.getC());
        } else {
            System.out.println("Недопустимый параметр ввода! Повторите ввод");
        }
    }
}
