// package Linked List;

public class ad {
    public static void main(String[] args) {
        // System.out.println("hello");
        Node head;
        Node FirstNode=new Node(10); 
        head=FirstNode;
        Node SecondNode=new Node(20);
        Node ThirdNode=new Node(40);
        FirstNode.next=SecondNode;
        SecondNode.next=ThirdNode;
        System.out.println("FirstNode data = "+FirstNode.data);

        // data of first node 
        System.out.println("FirstNode data = "+head.data);

        // head ke andr first node h to hmne head ke next wale ke data print krdiya mtlb second node ka data
        System.out.println("SecondNode data = "+head.next.data);


        System.out.println("Third Node data = "+head.next.next.data);

        System.out.println("SecondNode data = "+SecondNode.data);

        System.out.println("Adress of First Node = "+FirstNode.next);

        System.out.println("Adress of Second Node = "+SecondNode);

        System.out.println("Adress of Second Node = "+SecondNode.next);

        System.out.println("Data of Third Node = "+ThirdNode.data);

        System.out.println("Address of third node = "+ThirdNode.data);

        System.out.println("Address of 4th node store in third node = "+ThirdNode.next);


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
