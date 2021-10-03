package lesson8;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ChainingHashMap<Integer, String> map = new ChainingHashMap<>(7);
        map.put(2, "two");
        map.put(3, "tree");
//        System.out.println(map.contains(2));
//        System.out.println(map.get(2));

        System.out.println(map);
        System.out.println(map.remove(2));
        System.out.println(map);

//        LinearProbingHashMap<Integer, String> map = new LinearProbingHashMap<>(7);
//
//        map.put(2, "two");
//        System.out.println(map.contains(2));
//        System.out.println(map.get(2));
//        System.out.println(map);
//
//        map.put(11, "11");
//        map.put(10, "");
//        System.out.println(map);
//        map.put(9, "");
//        System.out.println(map);
    }
}
