package profdz4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task3 {
    public static void main(String[] args) {
        List<String> listStr = new ArrayList<>();
        listStr.addAll(Arrays.asList("abc","dfg","","ghy","","hhh"));
        long count = listStr.stream().filter(str -> !str.isEmpty()).count();
       System.out.println("Количество непустых строк: " + count);
    }
}
