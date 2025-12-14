package Assignment_1;

public class Question6 {

    class Node {
        int value;
        Node next;

        Node(int val) {
            value = val;
            next = null;
        }
    }

    Node head;

    public void add(int val) {
        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void rotate(int k) {
        if (head == null) {
            System.out.println("القائمة فارغة!");
            return;
        }

        System.out.println("التدوير بمـقدار: " + k + " موقع");

        int length = 1;
        Node last = head;
        while (last.next != null) {
            last = last.next;
            length++;
        }

        last.next = head;
        k = k % length;

        Node newLast = head;
        for (int i = 0; i < length - k - 1; i++) {
            newLast = newLast.next;
        }

        head = newLast.next;
        newLast.next = null;
    }

    public void printList() {
        Node temp = head;
        System.out.print("القائمة: ");
        while (temp != null) {
            System.out.print(temp.value);
            if (temp.next != null) {
                System.out.print(" -> ");
            }
            temp = temp.next;
        }
        System.out.println(" -> null");
    }
}