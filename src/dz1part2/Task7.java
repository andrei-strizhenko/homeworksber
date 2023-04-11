package dz1part2;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        int i = a.indexOf(' ');
        String name = a.substring(0, i);
        String surname = a.substring(i + 1);
        System.out.println(name);
        System.out.println(surname);
    }
}
