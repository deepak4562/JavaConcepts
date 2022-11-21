package JavaSortingComparableAndComparator;

public class Employee implements Comparable<Employee> {
    private int empId;
    private int age;
    private String empName;

    public Employee(int empId, int age, String empName) {
        this.empId = empId;
        this.age = age;
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public int getAge() {
        return age;
    }

    public String getEmpName() {
        return empName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", age=" + age +
                ", empName='" + empName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Employee empobj) {

        return this.age- empobj.age ;
    }
}
