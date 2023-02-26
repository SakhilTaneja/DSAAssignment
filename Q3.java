package Newbie.Assignment;
import java.util.Scanner;
public class Q3 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the number of elements you want to Insert: ");
        int n = sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter the values of Array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int temp;
        for(int i=1;i<=n/2;i++){
            for(int j=n-1;j>=2*i;j--){
                temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
            }
        }
        System.out.println("Array is: ");
        for (int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
