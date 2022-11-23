package CollectionPractice.ListIteratorInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class LIstIteratorClassTwo {
    public static void main(String[] args) {
        List frouts=new ArrayList();
        frouts.add("Apple");
        frouts.add("Orange");
        frouts.add("Grapes");
        frouts.add("Banana");
        frouts.add("Pine Apple");
        System.out.println(frouts);
        //now create the object of ListIterator Using listIterator() method
        ListIterator<String> froutsiterator=frouts.listIterator();
        while (froutsiterator.hasNext()){
            Object Obj = froutsiterator.next();
            String str=(String)Obj;
            //System.out.println(str);
            if (str=="Orange"){
                froutsiterator.add("Mango");
                System.out.println(frouts);

            } else if (str=="Grapes") {
                froutsiterator.remove();
                System.out.println(frouts);
            } else if (str == "Banana") {
                    froutsiterator.set("Coconut");
                System.out.println(frouts);
            }
        }


    }
}
