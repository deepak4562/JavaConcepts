package ArrayProgramms;

import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int arr[]=new int[size];
        for (int i = 0; i <size ; i++) {
            arr[i]= scanner.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
}
