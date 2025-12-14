package Assignment_1;

// السؤال 8: إيجاد موقع عنصر في القائمة
public class Question8 {

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    Node head;

    // إضافة عنصر
    public void add(int d) {
        Node n = new Node(d);

        if (head == null) {
            head = n;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = n;
        }
    }

    // البحث عن العنصر
    public int findIndex(int val) {
        Node temp = head;
        int index = 1;

        System.out.print("البحث عن القيمة " + val + " في القائمة: ");

        while (temp != null) {
            System.out.print(temp.data + " ");
            if (temp.data == val) {
                System.out.println("\nتم العثور عليها في الموضع: " + index);
                return index;
            }
            temp = temp.next;
            index++;
        }

        System.out.println("\nلم يتم العثور على القيـمة " + val);
        return -1; // إذا لم يوجد
    }

    // طباعة القائمة
    public void printList() {
        Node temp = head;
        System.out.print("عناصر القائمة: ");
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) {
                System.out.print(" -> ");
            }
            temp = temp.next;
        }
        System.out.println(" -> null");
    }
}