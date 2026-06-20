package JAVA8.Interface_.Comparator.OBJECT;

import com.sun.jdi.event.StepEvent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student {

    String name;
    int id;

    Student(String name , int id)
    {
        this.name=name;
        this.id=id;
    }


    public String toString() {
        return "Student{name='" + name + "', id=" + id + "}";
    }

}

 class MAIN
{
    public static void main(String[] args)
    {
        List<Student> s= new ArrayList<>();
        s.add( new Student("kartik ",1));
        s.add(new Student("parnay",2));

        Collections.sort(s,(a,b)->b.id-a.id);
        System.out.println(s);

    }
}
