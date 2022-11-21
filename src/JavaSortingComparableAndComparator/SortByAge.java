package JavaSortingComparableAndComparator;

import java.util.Comparator;

public class SortByAge implements Comparator<Employee> {
    @Override
    public int compare(Employee obj1, Employee obj2) {

        return obj1.getAge()-obj2.getAge();
    }
}
