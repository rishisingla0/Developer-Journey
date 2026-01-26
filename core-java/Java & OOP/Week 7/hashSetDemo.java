import java.util.*;
public class hashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(null);
        set.add(10);
        set.add(30);
        set.add(null);
        System.out.println(set);
    }
}
