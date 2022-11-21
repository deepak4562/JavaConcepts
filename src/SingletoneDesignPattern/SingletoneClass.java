package SingletoneDesignPattern;

public class SingletoneClass {
    private static SingletoneClass singletoneClass;

    private SingletoneClass() {
        String Myname="Deepak KUmar Das";
    }

    public static SingletoneClass getInstance() {
        if (singletoneClass==null){
            singletoneClass=new SingletoneClass();
        }

        return singletoneClass;
    }
}
