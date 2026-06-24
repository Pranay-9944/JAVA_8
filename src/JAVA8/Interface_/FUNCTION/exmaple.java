package JAVA8.Interface_.FUNCTION;

import Predicate.StudentValidation;
import com.sun.jdi.event.StepEvent;
import com.sun.security.jgss.GSSUtil;
import com.sun.source.tree.BreakTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class exmaple {
    void main() {
        Function<String, Integer> length = x -> x.length();
        Function<String, String> sub = st -> st.substring(0, 1);
        Function<String, Boolean> check = x -> x.equalsIgnoreCase("hello");

        System.out.println(length.apply("hello"));
        System.out.println(check.apply("hello"));

        Function<List<student>, List<student>> studentnamecheck = li ->
        {
  List<student> ans=new ArrayList<>();
            for( student s : li)
            {
                  if(sub.apply(s.getname()).equalsIgnoreCase("p"))
                  {     ans.add(s);

                  }
            }
            return ans;
        };

        student sl=new student(1,"pranay");
        student s2=new student(1,"pranay");
        student s3=new student(1,"pranay");
        student s4=new student(1,"pranay");
        List<student> std= Arrays.asList(sl,s2,s3,s4);
        List<student> mainlist=studentnamecheck.apply(std);
        System.out.println(mainlist);
    }


    private static class student {
        private String name;
        private int id;


        public int getId() {
            return id;
        }


        public String getname() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setId(int id) {
            this.id = id;
        }

        student( int id,String name) {
            this.id = id;
            this.name = name;
        }
        @Override
        public String toString() {
            return "Student{name='" + name + "', id=" + id + "}";
        }
    }
}
