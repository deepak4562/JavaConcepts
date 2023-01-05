package InterViewQuestions;

public class TestInteview02 implements Runnable{
    @Override
    public void run() {
        System.out.println("r1");
        System.out.println("r2");

    }

    public static void main(String[] args) {
        Thread t=new Thread(new TestInteview02());
        t.start();
        System.out.println("m1");
        //t.join();
        System.out.println("m2");




    }
}
