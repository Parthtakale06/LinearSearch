import java.util.*;
import java.io.*;

class linearSearch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of an aray");
        int size = sc.nextInt();

        System.out.println("enter the value of key which you need to search");
        int key = sc.nextInt();

        System.out.println("enter the ele of an array");
        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // for linear search we need to traverse using for loop
        int temp=-1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                temp=i;
                break;
            }
           
        }
        if(temp==-1){
            System.out.println("ele not found");
        }
        else{
            System.out.println("ele found at position\t"+(temp+1));
        }
      
    }

}
















