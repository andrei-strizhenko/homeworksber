package profdz4;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class task4 {
    public static void main(String[] args) {
        List<BigDecimal> list = Arrays.asList(new BigDecimal("24.455"), new BigDecimal("23.455"), new BigDecimal("28.455"), new BigDecimal("20.455"));
        List<BigDecimal> sortedList;
         sortedList = list.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("Sorted in descending order: " + sortedList);

    }
}
