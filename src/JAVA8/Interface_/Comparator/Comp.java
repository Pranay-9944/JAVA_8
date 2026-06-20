package JAVA8.Interface_.Comparator;

import java.util.*;

public class Comp {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(5, 2, 8, 1);

        Collections.sort(list, (a,b)->b-a);

        System.out.println(list);
    }
}