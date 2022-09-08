// package Linked List;

public class ad {
    public static void main(String[] args) {
        // System.out.println("hello");
        Node head;
        Node FirstNode=new Node(10); 
        head=FirstNode;
        Node SecondNode=new Node(20);
        FirstNode.next=SecondNode;
        System.out.println("FirstNode data = "+FirstNode.data);
        System.out.println("FirstNode data = "+head.data);
        System.out.println("SecondNode data = "+SecondNode.data);
        System.out.println("Adress of First Node = "+FirstNode.next);
        System.out.println("Adress of Second Node = "+SecondNode);
        System.out.println("Adress of Second Node = "+SecondNode.next);

    }
}
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        next=null;
    }
}
