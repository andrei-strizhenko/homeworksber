package homeWorkDz2SecondPart;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(recursion(N));
    }

    public static String recursion(int N) {
        if (N < 10) {
            return Integer.toString(N);
        }
        else {
            return recursion(N / 10) + " " + N % 10;
        }
    }
}
