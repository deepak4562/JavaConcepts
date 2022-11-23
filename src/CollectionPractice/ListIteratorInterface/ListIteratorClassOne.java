package CollectionPractice.ListIteratorInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorClassOne {
    public static void main(String[] args) {
        List<String> numbers=new ArrayList<>();
        numbers.add("one");
        numbers.add("two");
        numbers.add("twenty");
        numbers.add("four");
        numbers.add("five");
        ListIterator<String> listIterator= numbers.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
            System.out.println(listIterator.nextIndex());
        }
       // System.out.println("Deepak ".concat("Kumar"));
        //traversing the element in the backward direction
        System.out.println("In reverse direction using hasPrevious() method");
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
            System.out.println(listIterator.previousIndex());
        }

        //How to Add and Set element in List while Java ListIterator iterating
        List<String> alphabates=new ArrayList<>();
        alphabates.add("A");
        alphabates.add("B");
        alphabates.add("C");
        alphabates.add("D");
        alphabates.add("E");
        System.out.println(alphabates);
        ListIterator<String > alphaiterator=alphabates.listIterator();
        while (alphaiterator.hasNext()){
            System.out.println(alphaiterator.next());
        }
        alphaiterator.add("F");
        alphaiterator.add("G");
        System.out.println(alphabates);
        System.out.println("REVERSING THE ELEMENTS ");
        while (alphaiterator.hasPrevious()){
            System.out.println(alphaiterator.previous());
        }
        alphaiterator.set("H");
        alphaiterator.set("I");
        System.out.println(alphabates);
        alphaiterator.remove();  //will remove the last element
        System.out.println(alphabates);




    }
}
