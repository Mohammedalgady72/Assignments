package Assignment_1;

import java.util.HashSet;

// السؤال 10: حذف المكررات من القائمة الثنائية
public class Question10 {

    class Node {
        int value;
        Node prev;
        Node next;

        Node(int val) {
            value = val;
            prev = null;
            next = null;
        }
    }

    Node head;
    Node tail;

    // إضافة عنصر
    public void add(int val) {
        Node n = new Node(val);

        if (head == null) {
            head = n;
            tail = n;
        } else {
            tail.next = n;
            n.prev = tail;
            tail = n;
        }
    }

    // حذف المكررات
    public void removeDuplicates() {
        HashSet<Integer> set = new HashSet<>();
        Node temp = head;
        int removedCount = 0;

        System.out.println("حذف العناصر المكررة...");

        while (temp != null) {
            if (set.contains(temp.value)) {
                // حذف العقدة
                System.out.println("حذف العنصر المكرر: " + temp.value);
                removedCount++;

                if (temp.prev != null) {
                    temp.prev.next = temp.next;
                }
                if (temp.next != null) {
                    temp.next.prev = temp.prev;
                }
                if (temp == tail) {
                    tail = temp.prev;
                }
            } else {
                set.add(temp.value);
            }
            temp = temp.next;
        }

        System.out.println("تم حـذف " + removedCount + " عنصر مكرر");
    }

    // طباعة القائمة
    public void printList() {
        Node temp = head;
        System.out.print("عناصر القائمة: ");
        while (temp != null) {
            System.out.print(temp.value);
            if (temp.next != null) {
                System.out.print(" <-> ");
            }
            temp = temp.next;
        }
        System.out.println(" -> null");
    }
}