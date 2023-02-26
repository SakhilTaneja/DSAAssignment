package Newbie.Assignment;

import java.util.Scanner;

public class Q10 {
    static Scanner sc= new Scanner(System.in);
    static public class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
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
    public static int[] findIntersectionPosition(Node head1, Node head2){
        Node temp1=head1;
        Node temp2=head2;
        int m=1;
        int n=1;
        while(temp1!=null){
            while(temp2!=null){
                if(temp1.data==temp2.data){
                    int[] position={m,n};
                    return position;
                }
                n+=1;
                temp2=temp2.next;
            }
            n=1;
            temp1=temp1.next;
            temp2=head2;
            m+=1;
        }
        int[] position={-1,-1};
        return position;
    }

    public static void main(String[] args) {
        System.out.println("Enter List: ");
        Node head1=createLinkedList();
        printLinkedList(head1);
        Node head2=createLinkedList();
        int[] position=findIntersectionPosition(head1,head2);
        System.out.printf("Positions For Respective Linked Lists are %d,%d",position[0],position[1]);
    }
}
