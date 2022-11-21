package JavaSortingComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableClass {
    public static void main(String[] args) {
        List<Employee> list=new ArrayList<>();
        list.add(new Employee(2,22,"Deepak"));
        list.add(new Employee(1,52,"Pranab"));
        list.add(new Employee(6,12,"Chandan"));
        list.add(new Employee(3,23,"Gedu"));
        list.add(new Employee(2,55,"Uttam"));
        System.out.println(list);
      //  Collections.sort(list);//for Comparable Interface

        System.out.println("Sorting by Age Using Comparator");
        Collections.sort(list,new SortByAge());   //for Comparator Class
        System.out.println(list);

        System.out.println("Sorting by Name Using Comparator");
        Collections.sort(list,new SortByAge());
        System.out.println(list);




    }

}
