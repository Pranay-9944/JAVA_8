package JAVA8.Interface_;

interface A {
    default void sayhello() {
        System.out.println("hello");
    }
}

public class MyInterface implements A {

    public static void main(String[] args) {

        MyInterface obj = new MyInterface();
        obj.sayhello();
    }
}
