package Newbie.Assignment;
import java.util.Scanner;
public class Q9 {
    static Scanner sc= new Scanner(System.in);
    static public class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node Reverse(Node head,int position){
        Node temp=head;
        int count=2;
        while(count<position&&temp.next!=null){
            temp=temp.next;
            count++;
        }
        if(temp.next!=null&& count==position){
            Node start=temp.next;
            temp.next=temp.next.next;
            start.next=head;
            return start;
        }
        System.out.printf("Not Possible Linked does not contain %d elements \n",position);
        return head;
    }
    public static Node createLinkedList(){
        System.out.println("Enter the Elements you want to feed: ");
        Node curr=null;
        Node head=null;
        int data=sc.nextInt();
        do{
            Node temp=new Node(data);
            if(head==null){
                head=temp;
                curr=temp;
            }
            else {
                curr.next = temp;
                curr=curr.next;
            }
            data = sc.nextInt();
        }
        while(data!=-1);
        return head;
    }
    public static void printLinkedList(Node head){
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter List: ");
        Node head=createLinkedList();
        printLinkedList(head);
        System.out.print("Enter Position : ");
        int pos=sc.nextInt();
        head=Reverse(head,pos);
        printLinkedList(head);
    }
}
