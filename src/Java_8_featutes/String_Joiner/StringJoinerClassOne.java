package Java_8_featutes.String_Joiner;

import java.util.StringJoiner;

public class StringJoinerClassOne {
    public static void main(String[] args) {
        StringJoiner stringJoiner=new StringJoiner("|","[","]");
        stringJoiner.add("I");
        stringJoiner.add("Love");
        stringJoiner.add("My");
        stringJoiner.add("India");
//        stringJoiner.add("A").add("B").add("C");
//
//        StringJoiner stringJoiner1=new StringJoiner(":");
//        stringJoiner1.add("P").add("Q");
//
//        stringJoiner.merge(stringJoiner1);
        System.out.println(stringJoiner);

    }

}
