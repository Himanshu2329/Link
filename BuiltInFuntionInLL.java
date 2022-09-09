import java.util.LinkedList;

public class BuiltInFuntionInLL {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<String>();

        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);

        list.addFirst("this");
        list.addLast("list");
        System.out.println(list);
        System.out.println(list.size());
    }
}
