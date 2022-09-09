public class GetSizeOfLinkedList {
    Node head;
    private int size;
    GetSizeOfLinkedList(){
        int size=0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addFirst(String data) {
        Node First = new Node(data);
        if (head == null) {
            head = First;
            return;
        }

        First.next = head;
        head = First;
    }

    public void addLast(String data) {
        Node Last = new Node(data);
        if (head == null) {
            head = Last;
            return;
        }
        Node CurrentNode=head;
        while (CurrentNode.next!=null) {
            CurrentNode=CurrentNode.next;
        }

        CurrentNode.next=Last;

    }

    public void DelFirst() {
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        size--;
        head=head.next;
    }
    
    public void DelLast() {
        // Node DelLast=new Node(data);
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        size--;
        if(head.next==null){
            return;
        }

        Node SecondLast=head;
        Node LastNode=head.next;
        while (LastNode.next!=null) {
            LastNode=LastNode.next;
            SecondLast=SecondLast.next;
        }
        SecondLast.next=null;
    }

    public void printList() {
        if(head==null){
            System.out.println("List is Empty");
        }
        Node curNode=head;
        while (curNode!=null) {
            System.out.print(curNode.data+"-->");
            curNode=curNode.next;
        }
        System.out.println("Null");
    }
    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        GetSizeOfLinkedList list=new GetSizeOfLinkedList();
        list.addFirst("is");
        list.addFirst("a");
        list.printList();
        
        list.addLast("list");
        list.printList();
        
        list.addFirst("this");
        list.printList();

        list.addLast("Thanks");
        list.printList();
        
        list.DelFirst();
        list.printList();
        
        list.DelLast();
        list.printList();


        System.out.println(list.getSize());
        list.addLast("Kesan ba");
        list.printList();
        System.out.println(list.getSize());
    }
}
