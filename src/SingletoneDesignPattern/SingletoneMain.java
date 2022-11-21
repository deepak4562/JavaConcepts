package SingletoneDesignPattern;

public class SingletoneMain {
    public static void main(String[] args) {
        SingletoneClass obj1= SingletoneClass.getInstance();
        System.out.println(obj1);
        SingletoneClass obj2= SingletoneClass.getInstance();
        System.out.println(obj2);
        SingletoneClass obj3=SingletoneClass.getInstance();
        System.out.println(obj3.hashCode());
        SingletoneClass obj4=SingletoneClass.getInstance();
        System.out.println(obj4.hashCode());
    }
}
