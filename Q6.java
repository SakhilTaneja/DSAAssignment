package Newbie.Assignment;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Scanner;
public class Q6 {
    public static void mergeSort(int[] array){
        int len=array.length;
        if(len<=1) return;
        int[] left= Arrays.copyOfRange(array,0,len/2);
        int[] right= Arrays.copyOfRange(array,len/2,len);
        mergeSort(left);
        mergeSort(right);
        merge(array,left,right);
    }
    public static void merge(int[] array, int[] left,int[] right){
        int i=0,j=0,k=0;
        while(i<left.length&&j<right.length){
            if(left[i]<right[j]){
                array[k]=left[i];
                i++;
            }
            else{
                array[k]=right[j];
                j++;
            }
            k++;
        }
        while(i<left.length){
            array[k]=left[i];
            k++;
            i++;
        }
        while(j<right.length){
            array[k]=right[j];
            k++;
            j++;
        }
    }
    public static void findPairs(int arr[], int sum){
        int i=0;
        int diff=sum-arr[0];
        while(arr[i]<diff || i<arr.length){
            i++;
        }
        if(sum==arr[i]+arr[0]&&i< arr.length) {
            System.out.printf("%d+%d=%d", arr[0], arr[i],sum);
            int[] temp=Arrays.copyOfRange(arr,1,i);
            findPairs(temp,sum);
        } else if (i<arr.length) {
            int[] temp=Arrays.copyOfRange(arr,1,i);
            findPairs(temp,sum);
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter the length of Array:");
        Scanner sc= new Scanner(System.in);
        int len=sc.nextInt();
        int[] arr=new int[len];
        System.out.println("Enter the Elements to Insert in Array:");
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        mergeSort(arr);
        System.out.print(arr[0]);
        System.out.print("Enter The Sum:");
        int sum=sc.nextInt();
        findPairs(arr,sum);
    }
}
