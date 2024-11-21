package DD;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ArrayANDLinkedList {
    public static void main(String[] args) {
        int elementCount = 1_000_000;
        int randomAccessCount = 100_000;

        System.out.println("Работа с ArrayList:");
        ArrayList<String> arrayList = new ArrayList<>();
        testListPerformance(arrayList, elementCount, randomAccessCount);

        System.out.println("\nРабота с LinkedList:");
        LinkedList<String> linkedList = new LinkedList<>();
        testListPerformance(linkedList, elementCount, randomAccessCount);
    }


    public static void addElement(ArrayList<String> list, String element) {
        list.add(element);
        System.out.println("Добавлен элемент: " + element);
    }

    private static void testListPerformance(List<String> list, int elementCount, int randomAccessCount) {
        Random random = new Random();

        System.out.println("Добавление элементов: ");
        long startAdd = System.currentTimeMillis();
        for (int i = 0; i < elementCount; i++) {
            list.add("Элемент " + i);
        }
        long endAdd = System.currentTimeMillis();
        System.out.println("Время добавления " + elementCount + " элементов: " + (endAdd - startAdd) + " мс");

        System.out.println("Случайный доступ...");
        long startAccess = System.currentTimeMillis();
        for (int i = 0; i < randomAccessCount; i++) {
            list.get(random.nextInt(elementCount));
        }
        long endAccess = System.currentTimeMillis();
        System.out.println("Время случайного доступа " + randomAccessCount + " раз: " + (endAccess - startAccess) + " мс");
    }
}
