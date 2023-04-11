package dz1part2;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        int i = a.indexOf(' ');
        int newI = a.lastIndexOf(' ');
        String firstPart = a.substring(0,newI);
        String secondPart = a.substring(newI+1);
        System.out.println(firstPart);
        System.out.println(secondPart);
    }
}
