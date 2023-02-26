package Newbie.Assignment;

import java.util.Scanner;

public class Q4 {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
        }
    }
    public static int linkedListTraverse(Node head,int n){
        int count=0;
        for(int i=1;i<=n;i++){
            head=head.next;
        }
        return head.data;
    }
}
