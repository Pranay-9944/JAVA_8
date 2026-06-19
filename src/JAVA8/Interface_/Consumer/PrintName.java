package JAVA8.Interface_.Consumer;



import java.util.function.Consumer;

public class PrintName {
    public static void main(String[] args) {

        Consumer<String> print = name -> System.out.println(name);

        print.accept("Pranay");
    }
}