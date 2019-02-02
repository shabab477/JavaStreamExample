package examples;

import java.util.Arrays;
import java.util.List;

public class StreamThread {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);

        list.stream().forEach(value -> System.out.println(Thread.currentThread().getName()));

        System.out.println("Starting parallel stream");

        list.parallelStream().forEach(value -> System.out.println(Thread.currentThread().getName()));
    }
}
