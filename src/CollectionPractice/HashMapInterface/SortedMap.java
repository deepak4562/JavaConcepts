package CollectionPractice.HashMapInterface;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortedMap {
    public static void main(String[] args) {
        Map<String ,Integer> map=new HashMap<>();
        map.put("a",4);
        map.put("b",1);
        map.put("d",3);
        map.put("c",2);
        System.out.println("Before Sorted"+'\n'+map);

        LinkedHashMap<String,Integer> sortedmap = map.entrySet().stream().sorted((e1,e2) -> {
           return e1.getValue() - e2.getValue();
        }).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));

        System.out.println("After Sorted"+'\n'+sortedmap);

    }
}
