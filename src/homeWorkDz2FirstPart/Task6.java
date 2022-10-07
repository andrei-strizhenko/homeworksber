package homeWorkDz2FirstPart;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Task6 {
    public static void main(String args[]) throws IOException {

        String S = "", translate = "";
        char[] russian = {'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ж', 'З', 'И', 'Й', 'К', 'Л', 'М',
                'Н', 'О', 'П', 'Р', 'С', 'Т', 'У', 'Ф', 'Х',
                'Ц', 'Ч', 'Ш', 'Щ', 'Ъ', 'Ы', 'Ь', 'Э', 'Ю', 'Я'};

        String[] morze = {".-", "-...", ".--", "--.", "-..", ".", "...-", "--..", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", ".-.",
                "...", "-", "..-", "..-.", "....", "-.-.", "---.", "----", "--.-", "--.--", "-.--", "-..-", "..-..", "..--", ".-.-"};
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        S = br.readLine();
        if (S.length() > 0 && S.length() < 1000) {
            char[] massiveStr = S.toCharArray();
            for (int i = 0; i < massiveStr.length; i++) {
                for (int j = 0; j < russian.length; j++) {
                    if (russian[j] == massiveStr[i]) {
                        translate = translate + morze[j] + " ";
                    }
                }
            }
            System.out.println(translate);
            System.out.println("");
        }
    }
}








