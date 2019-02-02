package examples;

import java.util.ArrayList;
import java.util.List;

import utilities.DataSize;
import utilities.Util;

public class ForLoop {

    /**
     *   Process data:
     *   Multiply each element by 2
     *   Convert it to String in the format "The new number is {x}"
     **/
    public static void main(String[] args) {
        //Setup Data
        List<Integer> integerList = Util.setupData(DataSize.THOUSAND);
        long startTime = System.nanoTime();

        List<String> stringList = new ArrayList<>();

        for(Integer element : integerList) {
            Integer updatedValue = element * 2;
            String formattedText = String.format("The new number is %d", updatedValue);

            stringList.add(formattedText);
        }

        Util.printProgramTime(startTime, System.nanoTime());
    }
}
