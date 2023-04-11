package dz1part2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
if (x>0 && y>0 && x>-100 && y<100  ){
    boolean a = true;
    System.out.println(a);
}else{
    boolean a = false;
    System.out.println(a);
}
    }
}
