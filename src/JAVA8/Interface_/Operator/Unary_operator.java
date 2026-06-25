package JAVA8.Interface_.Operator;

import java.util.function.UnaryOperator;

public class Unary_operator {
    void main()
    {
        UnaryOperator<Integer> text= x -> x*x;
        System.out.println(   text.apply(10));;
    }


}
