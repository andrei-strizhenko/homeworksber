package profdz2.task3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(0,1,2,4));
        PowerfulSet pwSet = new PowerfulSet();

        System.out.println(pwSet.intersection(set1,set2));
        System.out.println(pwSet.union(set1,set2));
        System.out.println(pwSet.relativeComplement(set1,set2));

    }
}
