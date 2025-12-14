package Assignment_1;

// السؤال 12: البحث في القائمة الثنائية
public class Question12 {

    class Node {
        int data;
        Node prev;
        Node next;

        Node(int d) {
            data = d;
            prev = null;
            next = null;
        }
    }

    Node head;
    Node tail;

    // إضافة عنصر
    public void add(int d) {
        Node n = new Node(d);

        if (head == null) {
            head = n;
            tail = n;
        } else {
            tail.next = n;
            n.prev = tail;
            tail = n;
        }
    }

    // البحث عن العنصر
    public boolean search(int val) {
        Node temp = head;
        int position = 1;

        System.out.print("البحث عن " + val + " في القائمة: ");

        while (temp != null) {
            System.out.print(temp.data + " ");
            if (temp.data == val) {
                System.out.println("\nتم العثور على " + val + " في الموضع: " + position);
                return true;
            }
            temp = temp.next;
            position++;
        }

        System.out.println("\n" + val + " غير موجود في القائمة");
        return false;
    }

    // طباعة القائمة
    public void printList() {
        Node temp = head;
        System.out.print("عناصر القائمة: ");
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) {
                System.out.print(" <-> ");
            }
            temp = temp.next;
        }
        System.out.println(" -> null");
    }
}