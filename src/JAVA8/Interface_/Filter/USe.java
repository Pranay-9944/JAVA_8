package JAVA8.Interface_.Filter;
import java.util.Arrays;
import java.util.List;
import java.util.List;
public class USe {
void main()
    {

        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9);

        list.stream()
                .filter(n->n%2==0)
                .forEach(System.out::println);

    }
}
