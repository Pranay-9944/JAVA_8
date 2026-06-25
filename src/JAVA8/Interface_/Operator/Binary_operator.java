package JAVA8.Interface_.Operator;

import java.util.function.BinaryOperator;

public class Binary_operator {
    void main()
    {
        BinaryOperator<String> binaryOperator=(x,y)-> x+" "+y;
        System.out.println(  binaryOperator.apply("helloi",  "boy"));;
    }
}
