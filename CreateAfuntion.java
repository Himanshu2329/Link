public class CreateAfuntion {
    static Node insert(Node head,int data){
        Node new_node=new Node(data);
        if(head==null){
            return new_node;
        }
        Node tmp=head;
        while (tmp.next!=null) {
            tmp=tmp.next;
        }
        tmp.next=new_node;
        return head;
        // return new_node;

    }
    static void prinlist(Node head){
        // Node new_node=new Node(data);
        if(head==null){
            return;
        }
        Node tmp=head;
        while (tmp!=null) {
            System.out.print(tmp.data+" ");
            tmp=tmp.next;
        }
        System.out.println();
        // tmp.next=new_node;
        // return head;
        // return new_node;

    }
    public static void main(String[] args) {
        
        Node head=null;
        head =insert(head, 10);
        head=insert(head, 20);
        head=insert(head, 200);
        prinlist(head);
        head=insert(head, 205);
        head=insert(head, 210);
        prinlist(head);
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
