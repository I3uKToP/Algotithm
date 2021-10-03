package lesson4;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> mll = new MyLinkedList<>();

        mll.insertFirst(5);
        mll.insertFirst(15);
        mll.insertFirst(25);
        mll.insertFirst(35);
//
//        System.out.println(mll.removeFirst());
//
        System.out.println(mll);
        System.out.println(mll.indexOf(33));

//        mll.insertLast(2);
//        mll.insertLast(22);
//
//        System.out.println(mll);
//
//        mll.insert(2, 777);
//        System.out.println(mll);
////        System.out.println(mll.removeFirst());
////        System.out.println(mll);
////        System.out.println(mll.removeLast());
////        System.out.println(mll);
//
//        mll.insert(2, 111);
//        mll.insert(2, 22);
//        System.out.println(mll);
////
//        System.out.println(mll.remove(22));
//        System.out.println(mll);
//
//        for (Integer x : mll) {
//            System.out.println(x);
//        }
        MyLinkedQueue<Integer> mlq = new MyLinkedQueue<>();
        mlq.push(1);
        mlq.push(5);
        mlq.push(2);

        System.out.println(mlq.pop());
    }
}
