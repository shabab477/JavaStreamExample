package operators;

import utilities.Util;

import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {

    public static void main(String[] args) {
        List<List<Integer>> listOflists = Util.createListOfLists();

        List<Integer> flattenedIntegers = listOflists
                .stream()
                .flatMap(value -> value.stream())
                .collect(Collectors.toList());

        flattenedIntegers.forEach(System.out::println);
    }
}
