import java.util.*;
public class linkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        System.out.println(list);
        list.add(0, "Z");
        list.remove(2);
        System.out.println(list);
    }
}
