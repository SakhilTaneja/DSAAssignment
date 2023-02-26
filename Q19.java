package Newbie.Assignment;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
public class Q19 {
    public static Queue<Integer> reverseQueue(Queue<Integer> queue,int k){
        if(k> queue.size()){
            System.out.println("k cannot be greater than size of Queue");
            k= queue.size();
        }
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<k;i++){
            stack.push(queue.remove());
        }
        while(!stack.isEmpty()){
            queue.add(stack.pop());
        }
        for(int i=0;i< queue.size()-k;i++){
            queue.add(queue.remove());
        }
        return queue;
    }

    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        for(int i=10;i<=90;i=i+10){
            queue.add(i);
        }
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the ELements to Flip: ");
        int k=sc.nextInt();
        Queue<Integer> reverseQueue=reverseQueue(queue,k);
        System.out.println(reverseQueue);
    }
}
