package profdz2.task2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String s = "mama god";
        String t = "amam dog";
        System.out.println(anagramCheck(s,t));
    }

    public static boolean anagramCheck(String s, String t) {
        Set<Character> set1 = new HashSet<>();
        for (char ch : s.toCharArray()) {
            set1.add(ch);
        }
        set1.stream().forEach(System.out::print);
        System.out.println();

        Set<Character> set2 = new HashSet<>();
        for (char ch1 : t.toCharArray()) {
            set2.add(ch1);
        }
        set2.stream().forEach(System.out::print);
        System.out.println();
        if (set1.equals(set2)) {
            return true;
        } else {
            return false;
        }
    }
}