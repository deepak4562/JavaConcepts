package CollectionPractice.ListInterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorInterface {
    public static void main(String[] args) {
        List<String> arrayList=  List.of("Deepak","Uttam","Bikash","Raja Bhai","Sourav");
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        List<String> color=new ArrayList<>();
        color.add("Red");
        color.add("White");
        color.add("Green");
        color.add("Blue");
        color.add("Yellow");

        Iterator<String> iterator1 = color.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next().toUpperCase());
        }
    }
}
