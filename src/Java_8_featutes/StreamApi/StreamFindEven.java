package Java_8_featutes.StreamApi;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFindEven {
    public static void main(String[] args) {
        List<Integer> integerListone=List.of(2,4,5,6,7,9,42,60);

        List<Integer> integerListnew=new ArrayList<>();
        for (Integer i: integerListone){
            if(i%2==0){
                integerListnew.add(i);
            }
        }
        System.out.println(integerListnew);

        System.out.println("------Using Streams------------");
        //First way
        Stream<Integer> streamone=integerListone.stream();
        List<Integer> streamonelistnew=streamone.filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(streamonelistnew);

        //Second way
        List<Integer> stream=integerListone.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(stream);

        //find out the element which is >10
        List<Integer> greaterelementstream=integerListone.stream().filter(i->i>10).collect(Collectors.toList());
        System.out.println("the greater than 10 nos. are"+greaterelementstream);

        Stream<Integer> iterateallelements=integerListone.stream();

                iterateallelements.forEach(e->
                {
                    System.out.println(e);
                });



    }
}
