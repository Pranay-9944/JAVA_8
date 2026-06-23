package JAVA8.Interface_.Predicate;

import java.util.function.Predicate;

public class Use_in_String {
    public static void main(String[] args)
    {
        Predicate<String> len=str-> str.length()>=5;
        System.out.println(len.test("hello"));
    }
}
