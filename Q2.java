package Newbie.Assignment;

import java.util.Scanner;

public class Q2 {
    static String stringHandling(String s,int i){
        if(i==s.length()-1){
            return s;
        }
        else if (s.charAt(i)==s.charAt(i+1)){
            if(i==0){
                s=s.substring(i+2,s.length());
                return stringHandling(s,i);
            }
            else {
                s=s.substring(0,i).concat(s.substring(i+2,s.length()));
                return stringHandling(s,i-1);
            }
        }
        else{
            return stringHandling(s,i+1);
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter the word: ");
        Scanner sc = new Scanner(System.in);
        String s1=sc.next();
        System.out.println(s1.length());
       /* int count;
        do{
            count=0;
            int i=1;
            while(i<s1.length()){
                int len=s1.length();
                if(s1.charAt(i-1)==s1.charAt(i)){
                    if(i==1){
                        s1=s1.substring(i+1,len);
                    }
                    else if ((i==s1.length()-1)){
                        s1=s1.substring(0,i-1);
                    }
                    else{
                        String a = s1.substring(0, i - 1),b=s1.substring(i+1,len);
                        s1=a.concat(b);
                    }
                    count++;
                }
                else {
                    i++;
                }
            }
        } while(count>0);*/
        System.out.print(stringHandling(s1,0));
    }
}
