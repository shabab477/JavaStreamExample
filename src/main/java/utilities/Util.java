package utilities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Util {

    public static List<Integer> setupData(DataSize dataSize) {
        List<Integer> integerList = new ArrayList<>();

        for (int c = 0; c < dataSize.getSize(); c++) {
            integerList.add(c + 1);
        }

        return integerList;
    }

    public static void printProgramTime(long startTime, long endTime) {
        System.out.println("Program needed " + ((endTime - startTime ) / 1000000000.0));
    }

    public static List<List<Integer>> createListOfLists() {
        List<List<Integer>> listOfLists = new ArrayList<>();

        for (int c = 1; c <= 16; c += 4) {
            listOfLists.add(
                    IntStream
                            .rangeClosed(c, c + 3)
                            .boxed()
                            .collect(Collectors.toList())
            );
        }

        return listOfLists;
    }
}
