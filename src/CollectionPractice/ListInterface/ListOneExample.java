package CollectionPractice.ListInterface;

import java.util.ArrayList;
import java.util.List;

public class ListOneExample {
    public static void main(String[] args) {
        List<Integer> list1=new ArrayList<>();
        list1.add(23);
        list1.add(32);   //list are index based so it follows insertino order
        list1.add(3);    //list allows duplicate elements and can store multiple null element
        list1.add(88);
        System.out.println("printing the list element"+list1);
        list1.add(0,20);
        list1.add(2,30);
        list1.add(4,33);
        System.out.println("After adding the new element using indes"+list1);
        //lets remove the element through index
        list1.remove(2);
        System.out.println("After removing the element"+list1);
        //setting(updating) the element in the list
        list1.set(0,50);
        list1.set(4,99);
        System.out.println("After Updating the element in the list"+list1);
        //Iterating the list of element(Object)
        for (int i = 0; i <list1.size() ; i++) {
            if (list1.get(i)==99){
                list1.remove(i);
            }
            System.out.print(list1.get(i)+" ");

        }
        System.out.println();
        System.out.println(list1.contains(88));
        List<Integer> list2=new ArrayList<>();
        //list2.add(44);
        list2.add(33);
        list2.add(23);
        list2.add(50);
        System.out.println(list1.containsAll(list2));
        System.out.println(list2.containsAll(list1));
        //add the list2 in list1 using addAll() method
        list1.addAll(list2);
        System.out.println("after adding the all element in list1"+list1);

        List<String> stringList =
                List.of("Deepak", "Uttam", "Chandan", "Bikash", "Chintu",
                "Sourav", "Omm", "Kanha", "Sameer Bhai", "Puja");
        stringList.forEach((e)-> System.out.print(e +" "));




    }
}
