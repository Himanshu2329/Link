import java.util.spi.CurrencyNameProvider;

public class AddFirstAndLastInLL {
    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }

    }

    public void addFirst(String data) {
        Node first = new Node(data);
        if (head == null) {
            head = first;
            return;
        }

        first.next = head;
        head = first;

    }

    public void addLast(String data) {
        Node last = new Node(data);
        if (head == null) {
            head = last;
            return;
        }

        Node currnode = head;
        while (currnode.next != null) {
            currnode = currnode.next;
        }

        currnode.next = last;
    }

    public void printList() {
        // Node curNode=new Node;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node curNode=head;
        while (curNode!=null) {
            System.out.print(curNode.data+"-->");
            curNode=curNode.next;
        }

        System.out.println("null");

    }

    public static void main(String[] args) {
        AddFirstAndLastInLL list = new AddFirstAndLastInLL();
        list.addFirst("is");
        list.addFirst("a");
        list.printList();
        
        list.addLast("list");
        list.printList();
        
        list.addFirst("this");
        list.printList();

        list.addLast("Thanks");
        list.printList();
    }
}
