package JAVA8.Interface_.Lambda;
interface Add{
    int num(int a,int b);
}
public class addtwonum {
    public  static  void  main(String[] args)
    {
        Add sum=(a,b)-> a+b;
        System.out.println(sum.num(10,19));
    }
}
