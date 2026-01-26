import java.util.*;
public class arrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);
        System.out.println(list.get(1)); // access 2nd element
        list.set(2, 80); // update 3rd element
        System.out.println(list);
        list.remove(4); // remove last element
        System.out.println(list);
    }
}
