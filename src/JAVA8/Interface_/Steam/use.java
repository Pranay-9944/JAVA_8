package JAVA8.Interface_.Steam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class use {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 3, 2, 42, 4, 2);
        list.stream().forEach(System.out::println);
    }
}