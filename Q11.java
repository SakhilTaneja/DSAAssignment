package Newbie.Assignment;

public class Q11 {
    static public class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static void checkType(Node head){
        Node temp=head;
        while(temp.next!=null&&temp.next!=head){
            temp=temp.next;
        }
        if(temp.next==null) {
            System.out.println("Terminates with Null");
        }
        else{
            System.out.print("Circular Linked List");
        }
    }
}
