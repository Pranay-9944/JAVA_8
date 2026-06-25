package JAVA8.Interface_.Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class consumer_list {
    void main()
    {


        Consumer<List<Integer>>  list= li->
        {
            for (int i: li)
            {
                System.out.println(i+100);
            }

        };

        Consumer<List<Integer>>  list2= li->
        {
            for (int i: li)
            {
                System.out.println(i);
            }

        };

        list.andThen(list2).accept(Arrays.asList(1,2,3,2,3,2));


    }

}
