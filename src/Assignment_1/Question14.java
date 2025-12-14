package Assignment_1;

// السؤال 14: حذف من موقع محدد في القائمة الدائرية
public class Question14 {

    class Node {
        int value;
        Node next;

        Node(int val) {
            value = val;
            next = null;
        }
    }

    Node head;

    // إضافة عنصر
    public void add(int val) {
        Node n = new Node(val);

        if (head == null) {
            head = n;
            head.next = head; // دائرية
            System.out.println("تم إضافة: " + val + " (العنصر الأول)");
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = n;
            n.next = head;
            System.out.println("تم إضافة: " + val);
        }
    }

    // حذف من موقع
    public void deleteAt(int pos) {
        if (head == null) {
            System.out.println("القائمة فارغة!");
            return;
        }

        System.out.println("حذف العنصر في الموضع: " + pos);

        // إذا كان الموقع هو الأول
        if (pos == 1) {
            int deletedValue = head.value;

            if (head.next == head) {
                head = null;
                System.out.println("تم حذف: " + deletedValue + " (العنصر الوحيد)");
            } else {
                Node temp = head;
                while (temp.next != head) {
                    temp = temp.next;
                }
                head = head.next;
                temp.next = head;
                System.out.println("تم حذف: " + deletedValue + " (العنصر الأول)");
            }
            return;
        }

        // البحث عن الموقع
        Node current = head;
        int count = 1;

        while (count < pos - 1) {
            current = current.next;
            count++;
            if (current == head) {
                System.out.println("الموضع " + pos + " غير موجود!");
                return;
            }
        }

        if (current.next == head) {
            System.out.println("الموضع " + pos + " غير موجود!");
            return;
        }

        int deletedValue = current.next.value;
        System.out.println("تم حذف العنصر: " + deletedValue + " من الموضع " + pos);
        current.next = current.next.next;
    }

    // طباعة القائمة
    public void printList() {
        if (head == null) {
            System.out.println("القائمة فارغة");
            return;
        }

        Node temp = head;
        System.out.print("عناصر القائمة: ");

        do {
            System.out.print(temp.value);
            temp = temp.next;
            if (temp != head) {
                System.out.print(" -> ");
            }
        } while (temp != head);

        System.out.println(" -> (تعود للرأس)");
    }
}