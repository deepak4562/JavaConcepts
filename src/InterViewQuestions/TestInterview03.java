package InterViewQuestions;

public class TestInterview03 {
    static int x=3568;

    static {
        x=x++ + ++x;
    }

    {
        x=x-- - --x;
    }
    public static void main(String[] args) {
        System.out.println(x);


    }
}
