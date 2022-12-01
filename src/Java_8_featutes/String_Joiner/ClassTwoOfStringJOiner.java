package Java_8_featutes.String_Joiner;

import java.util.StringJoiner;

public class ClassTwoOfStringJOiner {
    public static void main(String[] args) {
        //Q.Merge the two Strings Using StringJoiner Class
        //Suppose we have two strings str1=A,B,C and str2=P:Q

        StringJoiner stringJoiner=new StringJoiner("," ,"[","]");
        stringJoiner.add("A").add("B").add("C");
        System.out.println(stringJoiner);

        //Create the Object of another StringJoiner
        StringJoiner stringJoiner1=new StringJoiner(":", "[","]" );
        stringJoiner1.add("P").add("Q");
        System.out.println(stringJoiner1);
        //let's merge the two strings
        stringJoiner.merge(stringJoiner1);
        System.out.println(stringJoiner);
        //Now if i want to add square brackets [] ,we can pass prefix and suffix




    }
}
