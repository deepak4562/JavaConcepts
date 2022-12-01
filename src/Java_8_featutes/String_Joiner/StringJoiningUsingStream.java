package Java_8_featutes.String_Joiner;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringJoiningUsingStream {
    public static void main(String[] args) {
        //Output: abc-xyz-777
        Stream<String> stream=Stream.of("acb","xyz","777");
        String str=stream.collect(Collectors.joining("-"));
        System.out.println(str);

    }
}
