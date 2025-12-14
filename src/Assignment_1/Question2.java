package Assignment_1;

import java.util.Random;

public class Question2 {

    public int[] removeRandom(int[] arr) {
        if (arr.length == 0) {
            System.out.println("المصفوفة فارغة!");
            return arr;
        }

        Random rand = new Random();
        int index = rand.nextInt(arr.length);
        int deletedValue = arr[index];

        int[] newArr = new int[arr.length - 1];
        int j = 0;

        System.out.println("تم حذف العنصر: " + deletedValue + " (في الفهرس " + index + ")");

        for (int i = 0; i < arr.length; i++) {
            if (i != index) {
                newArr[j] = arr[i];
                j++;
            }
        }

        return newArr;
    }

    public void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}