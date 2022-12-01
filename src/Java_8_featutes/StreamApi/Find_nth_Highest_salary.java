package Java_8_featutes.StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Find_nth_Highest_salary {
    public static void main(String[] args) {

//        List<Integer> asList = Arrays.asList(20, 23, 43, 55, 65, 21);
//        Integer integer = asList.stream().sorted((x,y)->y-x).skip(1).findFirst().get();
//        System.out.println(integer);

        List<EmployeePojo > employeePojos=new ArrayList<>();
        employeePojos.add(new EmployeePojo(101,"Deepak Kumar Das",45000.21));
        employeePojos.add(new EmployeePojo(102,"Uttam Kumar Sahu",74000.41));
        employeePojos.add(new EmployeePojo(103,"Chandan Sahu",34000.41));
        employeePojos.add(new EmployeePojo(104,"Bikash Kumar Sethy",72000.41));
        employeePojos.add(new EmployeePojo(105,"Om Prakash Behera",24000.41));
        employeePojos.add(new EmployeePojo(106,"Kajal Rani Singh",94000.41));


        EmployeePojo employeePojo = employeePojos.stream()
//                .sorted((e1, e2) ->
//                e2.getSalary()-e1.getSalary()).skip(1).findFirst().get();
                .sorted(Comparator.comparingDouble(EmployeePojo::getSalary).reversed())
                .skip(1).findFirst().get();
        //highest salary will varry according to skip ,salary will display in reverse order
        System.out.println(employeePojo);



    }
}
