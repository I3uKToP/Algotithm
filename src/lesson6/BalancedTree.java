package lesson6;

import java.util.Random;

public class BalancedTree {
    public static void main(String[] args) {
        int countOfTree = 100000;
        int countBalancedTree = 0;
        Random random = new Random();
        for (int i = 0; i < countOfTree; i++) {
            MyTreeMap<Integer, Integer> myTreeMap = new MyTreeMap<>();
            while (myTreeMap.height() !=6) {
                int integer = -100 + random.nextInt(200);
                myTreeMap.put(integer, integer);
            }
            if (myTreeMap.isBalanced()) {
                countBalancedTree++;
            }
        }
        int diff = countOfTree-countBalancedTree;
        double percent = diff/countOfTree*100;
        System.out.println("Общее количество деревьев: " + countOfTree);
        System.out.println("Количество несбалансированных: " + diff);
        System.out.println("Количество сбалансированных " + countBalancedTree);
        System.out.println("Процент несбалансированнхы деревьев: " + percent + "%");
    }
}
