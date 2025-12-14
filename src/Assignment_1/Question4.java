package Assignment_1;

public class Question4 {

    public void reverse(int[] arr) {
        System.out.print("العناصر قبل العكس: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        System.out.print("العناصر بعد العكس: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
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