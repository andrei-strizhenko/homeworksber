package profdz4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class task5 {
    public static void main(String[] args) {
        List<String> listStr = new ArrayList<>();
        listStr.addAll(Arrays.asList("abc", "dfg", "ghy", "hhh"));
        List<String> result;
        result = Collections.singletonList(listStr.stream()
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.joining(", ")));

        result.forEach(System.out::print);
    }
}
