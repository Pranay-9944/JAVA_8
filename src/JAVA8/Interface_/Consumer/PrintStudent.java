package JAVA8.Interface_.Consumer;

import java.util.function.Consumer;

public class PrintStudent {
    public static void main(String[] args) {

        Consumer<String> student = name ->
                System.out.println("Student Name: " + name);

        student.accept("Pranay");
    }
}