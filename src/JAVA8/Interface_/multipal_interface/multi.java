package JAVA8.Interface_.multipal_interface;
interface parent
{
    default void sayhello()
    {
        System.out.println("hello world");
    }
}
interface child {
    default void sayhello()
    {
        System.out.println("hello world");
    }
}

public class multi implements parent,child{
    public static void  main(String[] args)
    {
        multi m=new multi();
        m.sayhello();
    }

    @Override
    public void sayhello() {
        parent.super.sayhello();
    }
}
