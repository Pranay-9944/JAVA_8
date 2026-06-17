package JAVA8.Interface_.FUNCTION;



import java.util.function.Function;

public class SquareNumber {
    public static void main(String[] args) {

        Function<Integer, Integer> square = n -> n * n;

        System.out.println(square.apply(5));
        System.out.println(square.apply(10));
    }
}