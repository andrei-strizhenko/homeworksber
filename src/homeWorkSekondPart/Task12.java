package homeWorkSekondPart;

import java.util.Locale;
import java.util.Scanner;
//(2 балла) У Марата был взломан пароль. Он решил написать программу,
//которая проверяет его пароль на сложность. В интернете он узнал, что пароль
//должен отвечать следующим требованиям:
//● пароль должен состоять из хотя бы 8 символов;
//● в пароле должны быть:
//○ заглавные буквы
//○ строчные символы
//○ числа
//○ специальные знаки(_*-)
//Если пароль прошел проверку, то программа должна вывести в консоль строку пароль
//надежный, иначе строку: пароль не прошел проверку

public class Task12 {
    public static void main(String[] args) {
        int big = 0;
        int small = 0;
        int sign = 0;
        int numeric = 0;

        Scanner scanner = new Scanner(System.in);
        String login = scanner.next();
        int s = login.length();
      //  System.out.println(s);
        if (s > 8) {
            for (int i = 0; i < login.length() - 1; i++) { //перебираем буквы из строки в цикле от 0 до количества букв минус одну
                char letter = login.substring(0, login.length()).charAt(i);// забираем из строки login буквы под номерами позиции i
                //  System.out.println((int) letter);
                int number = (int) letter; //присваиваем каждой перебранной букве код из таблицы ASCII

                if (number >= 65 && number <= 90) {
                    big = 1;
                }
                if (number >= 97 && number <= 122) {
                    small = 1;
                }
                if (number <= 47 && number >= 33 || number <= 64 && number >= 58 || number <= 96 && number >= 91 || number <= 126 && number >= 123) {
                    sign = 1;
                }
                if (number >= 48 && number <= 57) {
                    numeric = 1;
                }
            }
        }
        int total = big + small + sign + numeric;
       // System.out.println("TOTAL" + total);
        if (total == 4) {
            System.out.println("пароль надежный");
        } else {
            System.out.println("пароль не прошел проверку");
        }

    }

}

