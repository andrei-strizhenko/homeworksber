package new1;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        input();
        int res;
    }





    private static final Scanner scanner = new Scanner(System.in);

    private static int a;
    private static int b;
    private static char c;

    public static void input() {
        try{
        a = scanner.nextInt();
        c = scanner.next().charAt(0);
        b = scanner.nextInt();
    }catch(RuntimeException e){
            throw new RuntimeException();
        }
    }

  /*  public int calculate() throws MyWrongOperatorException {
        switch (c) {
            case '+' : return sum();
            case '-' : return sub();
            case '/' : return integerDiv();
            case '*' : return mul();
         //   default -> throw new MyWrongOperatorException();
        }

        return 0;
    }*/

    private int sum() {
        return a + b;
    }

    private int sub() {
        return a - b;
    }

    private int integerDiv() {
        return a / b;
    }

    private int mul() {
        return a * b;
    }

}
