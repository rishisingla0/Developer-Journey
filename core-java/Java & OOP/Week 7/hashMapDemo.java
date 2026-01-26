import java.util.HashMap;

public class hashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(5, "E");
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, "D");
        System.out.println(map);
        System.out.println(map.get(3));
        map.put(2, "z");
        System.out.println(map);
        map.remove(5);
        System.out.println(map);
    }
}
