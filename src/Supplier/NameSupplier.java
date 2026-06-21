package Supplier;

import java.util.function.Supplier;

public class NameSupplier {
    public static void main(String[] args) {

        Supplier<String> s = () -> "Pranay";

        System.out.println(s.get());
    }
}