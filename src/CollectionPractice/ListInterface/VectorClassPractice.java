package CollectionPractice.ListInterface;

import java.util.Scanner;
import java.util.Vector;

public class VectorClassPractice {
    public static void main(String[] args) {
        int n=5;
        Vector<Integer> vectorlist=new Vector<>(n); //the size of the vector will grow dynamically 100%
        vectorlist.add(120);                       //it is a legacy class and it is Synchronized
        vectorlist.add(90);
        Scanner scanner=new Scanner(System.in);
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter the element -> "+i);
            vectorlist.add(scanner.nextInt());
        }
        //Iterating element
        vectorlist.forEach((e)-> System.out.print(e +" "));
        System.out.println();

        vectorlist.remove(0);

        //printing all element using the get(index ) method  after removing the element
        for (int i = 0; i <vectorlist.size() ; i++) {
            System.out.print(vectorlist.get(i) +" ");


        }
    }
}
