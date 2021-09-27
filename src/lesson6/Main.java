package lesson6;

public class Main {
    public static void main(String[] args) {
        MyTreeMap<Integer, String> map = new MyTreeMap<>();

        map.put(5, "five");
        map.put(4, "four");
        map.put(6, "six");
//        map.put(2, "two");
//        map.put(3, "three");


        System.out.println(map);
        System.out.println("Высота: " + map.height());
        System.out.println("Сбалансированно? : " + map.isBalanced());


    }
}
