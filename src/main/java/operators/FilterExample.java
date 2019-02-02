package operators;

import utilities.DataSize;
import utilities.Util;

import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {

    public static void main(String[] args) {
        List<Integer> integerList = Util.setupData(DataSize.TEN);

        List<String> stringList = integerList
                .stream()
                .filter(value -> value % 2 == 0)
                .map(value -> String.format("The new number is %d", value))
                .collect(Collectors.toList());

        stringList.forEach(System.out::println);
    }
}
