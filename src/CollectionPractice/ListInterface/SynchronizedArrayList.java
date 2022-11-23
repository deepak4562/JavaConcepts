package CollectionPractice.ListInterface;

import java.util.ArrayList;

public class SynchronizedArrayList extends Thread {
    ArrayList<Integer> arrayList;


    //create one parameter constructor
    SynchronizedArrayList(ArrayList<Integer> list) {
        this.arrayList = list;
    }

    @Override
    public void run() {
        System.out.println("Inside the run method:");
        for (int i = 0; i < 6; i++) {
            arrayList.add(i);
            //  System.out.println(arrayList);
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }

    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();

        SynchronizedArrayList multhre = new SynchronizedArrayList(integerArrayList);
        SynchronizedArrayList multhread = new SynchronizedArrayList(integerArrayList);
        //call the start() method using the reference
        multhre.start();
        multhread.start();
        try {
            multhread.join();
            multhre.join();
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
        System.out.println("The Size of List is "+integerArrayList.size());
        for (Integer integer:integerArrayList){
            System.out.println(integer);
        }


}
}

