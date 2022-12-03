package profdz4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task2 {
    public static void main(String[] args) {
        // перемножение чисел из списка List
        List<Integer> listNum = new ArrayList<>();
        listNum.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println(listNum.stream().reduce(1, (a, b) -> a * b)); //identity - 1 раз проделать данную процедуру (1 поток)
    }
}
