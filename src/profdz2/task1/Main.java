package profdz2.task1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("Maksim");
        name.add("Pavel");
        name.add("Victor");
        name.add("Maksim");
        name.add("Andrei");
        name.add("Maksim");
        UnicalName(name);
        List<Integer> number = new ArrayList<>();
        number.add(2);
        number.add(6);
        number.add(6);
        number.add(7);
        UnicalName(number);
    }

    public static <T> void UnicalName(List<T> list) {
        Set<T> set = new HashSet<>(list);
        set.stream().forEach(System.out::println);
    }
}
