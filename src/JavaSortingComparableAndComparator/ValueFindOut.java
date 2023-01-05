package JavaSortingComparableAndComparator;

import java.util.ArrayList;
import java.util.List;

public class ValueFindOut {
    public static void main(String[] args) {
        List<Employee> list=new ArrayList<>();
        list.add(new Employee(2,22,"Deepak"));
        list.add(new Employee(1,52,"Pranab"));
        list.add(new Employee(6,12,"Chandan"));
        list.add(new Employee(3,23,"Gedu"));
        list.add(new Employee(2,55,"Uttam"));
        System.out.println(list.get(0).getEmpName());
    }
}
