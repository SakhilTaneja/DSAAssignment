package Newbie.Assignment;

public class Q5 {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
        }
    }
    public static Node returnNode(Node head,int k){
        int length=0;
        Node temp=head;
        while (temp.next!=null){
            length++;
            temp=temp.next;
        }
        int remainder=length%k;
        length=length-remainder;
        for(int i=1;i<=length;i++){
            head=head.next;
        }
        return head;
    }
}
