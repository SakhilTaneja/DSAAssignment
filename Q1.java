package Newbie.Assignment;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        System.out.print("Enter Length of Array: ");
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("Enter The Elements of Array: ");
        int[] A= new int[n];
        int i;
        for(i=0;i<n;i++){
            A[i]=sc.nextInt();
        }
        for(i=0;i<n-1;i++){
            int j = i+1;
            while(A[j]<=A[i]&&j<n-1){
                j++;
            }
            if(A[j]>A[i]){
                A[i]=A[j];
            }
        }
        System.out.println("Final Array = ");
        for( i=0;i<n;i++){
            System.out.printf("%d ",A[i]);
        }
    }
}
