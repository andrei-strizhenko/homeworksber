package dz1part3;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        int i = 0;
        int space = 0;
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        for (i = 0; i < s.length(); i++) {
            s.charAt(i);
            space = s.length() - s.replaceAll(" ", "").length(); //считываем кол-во пробелов
        }
        System.out.println(i - space);
    }
}

