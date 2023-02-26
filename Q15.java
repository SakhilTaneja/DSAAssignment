package Newbie.Assignment;
import java.util.Queue;
import java.util.LinkedList;
public class Q15 {
    public static class StackWith2Queues{
        private Queue<Integer> queue1=new LinkedList<>();
        private Queue<Integer> queue2=new LinkedList<>();
        private int top;
        public void push(int item){
            queue1.add(item);
            top=item;
        }
        public int pop(){
            if(queue1.isEmpty()){
                System.out.println("Stack UnderFlow");
                return -1;
            }
            while(queue1.size()>1){
                top=queue1.remove();
                queue2.add(top);
            }
            int item =queue1.remove();
            Queue<Integer> temp=queue1;
            queue1=queue2;
            queue2=temp;
            return item;
        }
        public int peek(){
            if(queue1.isEmpty()){
                System.out.println("Stack is Empty");
                return -1;
            }
            return top;
        }
    }

    public static void main(String[] args) {
        StackWith2Queues s1=new StackWith2Queues();
        s1.push(5);
        s1.push(4);
        System.out.println("Top Element: "+s1.peek());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
    }
}
