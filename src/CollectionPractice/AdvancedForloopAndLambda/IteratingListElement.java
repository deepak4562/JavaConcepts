package CollectionPractice.AdvancedForloopAndLambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IteratingListElement {
    public static void main(String[] args) {
        List<String> month=new ArrayList<>();
        month.add("January");
        month.add("February");
        month.add("March");
        month.add("April");
        month.add("May");
        month.add("June");
        System.out.println(month);
        //Now make the ArrayList Synchronized
        Collections.synchronizedList(month);
        //contains() method returns boolean value true or false
        System.out.println(month.contains("June"));
        //Iterating element Using For each loop
        for (String nowmonth: month){
            System.out.print(nowmonth +" ");
        }

        // Iterating element Using lambda
        System.out.println('\n'+"Iterating element Using lambda");
        month.forEach((ele)-> System.out.print(ele+" "));


    }
}
