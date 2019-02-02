package examples;

import java.util.Arrays;
import java.util.List;

public class ParallelSequential {

    public static void main(String[] args) {
        //Setup Data
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);

        list.stream().forEach(System.out::println);

        System.out.println();

        list.parallelStream().forEach(System.out::println);
    }
}
