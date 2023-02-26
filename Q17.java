package Newbie.Assignment;

import java.util.Scanner;

public class Q17 {
    static Scanner sc=new Scanner(System.in);
    public static void slidingWindow(int[] array,int size){
        for(int i=0;i<=array.length-size;i++){
            for(int j=0;j<size;j++){
                System.out.print(array[i+j]+" ");
            }
            System.out.println();
        }
    }
    public static void createArray(int[] array,int size){
        System.out.println("Enter Elements of Array:");
        for(int i=0;i<size;i++){
            array[i]= sc.nextInt();;
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter The Size Of Array");
        int arraySize=sc.nextInt();
        int[] array = new int[arraySize];
        createArray(array,arraySize);
        System.out.println("Enter Window Size:");
        int size=sc.nextInt();
        slidingWindow(array,size);
    }
}
