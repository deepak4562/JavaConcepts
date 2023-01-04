package Java_8_featutes.StreamApi;

import java.util.List;
import java.util.stream.Collectors;

public class MinMaxUsingStream {
    public static void main(String[] args) {
        List<Integer> numbers=List.of(20,21,4,3,69,11,7);
        //map can itself return an element and will return the value
        List<Integer> newnumbers=numbers.stream().map(i->i-10).collect(Collectors.toList());
        System.out.println(newnumbers);

        //Max number in the list
        Integer maxlist=numbers.stream().max((x,y)->x.compareTo(y)).get();
        System.out.println(maxlist);

        //Min number in the list
        Integer minlist=numbers.stream().min((x,y)->x.compareTo(y)).get();
        System.out.println(minlist);




    }
}
