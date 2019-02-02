package operators;

import utilities.DataSize;
import utilities.Util;

import java.util.List;
import java.util.stream.Collectors;

public class MapExample {

    public static void main(String[] args) {
        //Setup Data
        List<Integer> integerList = Util.setupData(DataSize.TEN);

        List<String> stringList = integerList
                .stream()
                .map(value -> value * 2)
                .map(value -> String.format("The new number is %d", value))
                .collect(Collectors.toList());

        stringList.forEach(System.out::println);
    }
}
