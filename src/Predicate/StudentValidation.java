package Predicate;

import java.util.function.Predicate;

public class StudentValidation {
    public static void main(String[] args) {

        Predicate<Integer> age = a -> a >= 18;
        Predicate<Integer> marks = m -> m >= 40;

        System.out.println(age.and(marks).test(50));
        System.out.println(age.and(marks).test(15));
    }
}