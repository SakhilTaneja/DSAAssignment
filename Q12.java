package Newbie.Assignment;
import java.util.Scanner;
public class Q12 {
    public static Boolean checkPalindrome(String word){
        char[] arr=word.toCharArray();
        for(int i=0;i<=arr.length/2;i++){
            if(arr[i]!=arr[(arr.length-1)-i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.print("Enter the String: ");
        Scanner sc =new Scanner(System.in);
        String word=sc.nextLine();
        System.out.println(checkPalindrome(word));
    }
}
