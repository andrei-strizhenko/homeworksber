package homeWorkThirdPart;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int size = scanner.nextInt();

            for (int i = 0; i < size; i++) {
                for (int j = 0; j < i * 2 + 1; j++){
                    if (i == 0){
                        for (int k = 0; k < (((size * 2) / 2) - 1); k++){
                            System.out.print(" ");
                        }
                        System.out.print("#");
                    }
                    else {
                        System.out.print("#");
                    }
                }
                System.out.println(" ");
                for (int x = i; x < (size - 2); ++x) {
                    System.out.print(" ");
                }
            }

            for (int copy = 0; copy < (((size * 2) / 2) - 1); copy++) {
                System.out.print(" ");
            }
            System.out.print("|");
        }

    }








