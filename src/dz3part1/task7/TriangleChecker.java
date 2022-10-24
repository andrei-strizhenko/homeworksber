package dz3part1.task7;

public class TriangleChecker {
    private double a = 0;
    private double b = 0;
    private double c = 0;

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public static void Checker(double a, double b, double c) {
        double max;
        if (a > b && a > c) {
            max = a;
            boolean d = max < b + c ? (true) : (false);
            System.out.println(d);
        }
        if (b > a && b > c) {
            max = b;
            boolean d = max < a + c ? (true) : (false);
            System.out.println(d);
        }
        if (c > a && c > b) {
            max = c;
            boolean d = (max < a + b) ? (true) : (false);
            System.out.println(d);
        }
    }
}
