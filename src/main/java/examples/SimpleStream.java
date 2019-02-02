package examples;

import utilities.DataSize;
import utilities.Util;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SimpleStream {

    /**
     *   Process data:
     *   Multiply each element by 2
     *   Convert it to String in the format "The new number is {x}"
     **/
    public static void main(String[] args) {
        //Setup Data
        List<Integer> integerList = Util.setupData(DataSize.THOUSAND);
        long startTime = System.nanoTime();

        List<String> stringList = integerList
                .stream()
                .map(value -> value * 2)
                .map(value -> String.format("The new number is %d", value))
                .collect(Collectors.toList());


        Util.printProgramTime(startTime, System.nanoTime());
    }
}
