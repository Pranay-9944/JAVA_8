package JAVA8.Interface_.Predicate;

import java.util.function.Predicate;

public class AgeValidation {
    public static void main(String[] args) {

        Predicate<Integer> canVote = age -> age >= 18;

        System.out.println(canVote.test(20));
        System.out.println(canVote.test(16));
    }
}