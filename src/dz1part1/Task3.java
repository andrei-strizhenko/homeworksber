package dz1part1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        if (userName.length() > 0 && userName.length() < 100) {
            System.out.println("Привет, " + userName + "!");
        }
    }
}
