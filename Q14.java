package Newbie.Assignment;
import java.util.Queue;
import java.util.Stack;
public class Q14 {
    public static class Queue{
        static Stack<Integer>stack1;
        static Stack<Integer>stack2;
        Queue(){
            this.stack1=new Stack<>();
            this.stack2=new Stack<>();
        }
        static void enQueue(int value){
            stack1.push(value);
        }
        static int deQueue(){
            if(stack2.isEmpty()){
                while(!stack1.isEmpty()){
                    stack2.push(stack1.pop());
                }
            }
            if(stack2.isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return stack2.pop();
        }
    }

    public static void main(String[] args) {
        Queue myQueue=new Queue();
        myQueue.enQueue(5);
        myQueue.enQueue(6);
        System.out.println(myQueue.deQueue());
        System.out.println(myQueue.deQueue());
        System.out.println(myQueue.deQueue());
    }
}
//Time Complexity of enQueue is O(1) and deQueue is O(n)
