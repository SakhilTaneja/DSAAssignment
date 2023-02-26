package Newbie.Assignment;

public class Q13 {
    static public class twoStack{
        int[] array;
        private int top1;
        private int top2;
        public twoStack(int size){
            this.array=new int[size];
            this.top1=-1;
            this.top2=size;
        }
        public boolean isEmpty(){
            if(top1==-1&&top2== array.length){
                return true;
            }
            return false;
        }
        public boolean isFull(){
            if(top1==top2-1){
                return true;
            }
            return false;
        }
        public void push1(int n){
            if(this.isFull()){
                System.out.println("Stack Overflow");
                return;
            }
            top1=top1+1;
            array[top1]=n;
        }
        public void push2(int n){
            if(this.isFull()){
                System.out.println("Stack OverFlow");
                return;
            }
            top2=top2-1;
            array[top2]=n;
        }
        public int pop1(){
            if(top1==-1){
                System.out.println("Stack UnderFlow");
                return -1;
            }
            int topElement=array[top1--];
            return topElement;
        }
        public int pop2(){
            if(top2== array.length){
                System.out.println("Stack UnderFlow");
                return -1;
            }
            int topElement=array[top2++];
            return topElement;
        }
        public void stack1Display(){
            for(int i=top1;i>=0;i--){
                System.out.print(array[i]+" ");
            }
        }
        public void stack2Display(){
            for(int i=top2;i< array.length;i++){
                System.out.println(array[i]+" ");
            }
        }

        public static void main(String[] args) {
            twoStack myStack=new twoStack(4);
            myStack.push1(1);
            myStack.push1(3);
            myStack.push2(2);
            myStack.stack1Display();
            System.out.println();
            myStack.stack2Display();
            myStack.pop2();
            myStack.stack2Display();
            myStack.pop2();
        }
    }
}
