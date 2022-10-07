package homeWorkDz2FirstPart;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task9 {
    public static void main(String[] args) {
        String[] ai = new String[0];
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        if (N > 0 && N < 100) {
            ai = new String[N];
            if (ai.length > 0 && ai.length < 1000) {
                // ai[0] =  scanner.nextLine();

                for (int i = 0; i < ai.length; i++) {
                    String a = scanner.next();
                    ai[i] = a;
                }
            }
        }
        findDuplicate(N, ai);
    }


    public static void findDuplicate(int N, String[] strings) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            if (!set.add(strings[i])) {
                System.out.println(strings[i]);
            }
        }
    }


}
