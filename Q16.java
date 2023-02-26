package Newbie.Assignment;
import java.util.Stack;
import java.util.Scanner;

public class Q16 {
    public static boolean checkPairs(Stack<Integer> stack){
        if(stack.isEmpty()){
            System.out.println("is Empty");
            return false;
        }
        if(stack.size()%2!=0){
            stack.pop();
        }
        while(!stack.isEmpty()){
            int first = stack.pop();
            int second = stack.pop();
            if(Math.abs(first-second)!=1){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Stack<Integer> myStack=new Stack<>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(4);
        myStack.push(5);
        System.out.println(checkPairs(myStack));
        myStack.push(8);
        System.out.println(checkPairs(myStack));
        System.out.println(checkPairs(myStack));
        myStack.push(0);
        System.out.println(checkPairs(myStack));
    }
}
