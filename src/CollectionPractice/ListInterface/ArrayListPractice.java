package CollectionPractice.ListInterface;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ArrayListPractice{
    public static void main(String[] args) {
        int n=3;
        ArrayList<Integer> arrayList=new ArrayList<>(n); //the size of the arraylist will grow dynamically
        arrayList.add(120);
        arrayList.add(90);
        Scanner scanner=new Scanner(System.in);
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter the element -> "+i);
            arrayList.add(scanner.nextInt());
        }
        //Iterating element
       arrayList.forEach((e)-> System.out.print(e +" "));
        System.out.println();

        arrayList.remove(0);

        //printing all element using the get(index ) method  after removing the element
        for (int i = 0; i <arrayList.size() ; i++) {
            System.out.print(arrayList.get(i) +" ");


        }

        ArrayList<String> strings=new ArrayList<>(5);
        strings.add("Deepak");   //arraylist can grow its size 50% of the initial capacity
        strings.add("Uttam");    //it is not a legacy class and it is not synchronized
        strings.add("Gedu");
        strings.add("Chintu");
        strings.add("Sourav");
        System.out.println(strings.size());
        System.out.println(strings.indexOf("Chintu"));
        System.out.println(strings.lastIndexOf("Uttam"));



    }
}
