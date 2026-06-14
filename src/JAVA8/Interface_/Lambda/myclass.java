package JAVA8.Interface_.Lambda;

interface Employee{

    String getname();
}

public class myclass {
    public static void main(String[] args)
    {
        Employee e=()->{return "software Enginner";};

        System.out.println(e.getname());
    }
}
