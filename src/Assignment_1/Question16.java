package Assignment_1;

// السؤال 16: تقسيم القائمة الدائرية لنصفين
public class Question16 {

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
            head.next = head;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = n;
            n.next = head;
        }
    }

    // تقسيم القائمة
    public void splitList() {
        if (head == null) {
            System.out.println("القائمة فارغة!");
            return;
        }

        if (head.next == head) {
            System.out.println("القائمة تحتوي على عنصر واحد فقط!");
            return;
        }

        System.out.println("تقسيم القائمة الدائرية إلى نصفين...");

        // إيجاد المنتصف
        Node slow = head;
        Node fast = head;

        while (fast.next != head && fast.next.next != head) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // القائمة الثانية
        Node head2 = slow.next;

        // جعل القائمة الأولى دائرية
        slow.next = head;

        // جعل القائمة الثانية دائرية
        Node temp = head2;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = head2;

        // طباعة القائمتين
        System.out.print("النصف الأول (" + countNodes(head) + " عناصر): ");
        printCircular(head);

        System.out.print("النصف الثاني (" + countNodes(head2) + " عناصر): ");
        printCircular(head2);
    }

    // عد العناصر في قائمة دائرية
    int countNodes(Node h) {
        if (h == null) return 0;

        int count = 0;
        Node temp = h;
        do {
            count++;
            temp = temp.next;
        } while (temp != h);

        return count;
    }

    // طباعة قائمة دائرية
    void printCircular(Node h) {
        if (h == null) {
            System.out.println("فارغة");
            return;
        }

        Node temp = h;
        do {
            System.out.print(temp.value);
            temp = temp.next;
            if (temp != h) {
                System.out.print(" -> ");
            }
        } while (temp != h);
        System.out.println(" -> (دائرية)");
    }

    // طباعة القائمة الحالية
    public void printList() {
        if (head == null) {
            System.out.println("القائمة فارغة");
            return;
        }

        System.out.print("عناصر القائمة (" + countNodes(head) + " عناصر): ");

        Node temp = head;
        do {
            System.out.print(temp.value);
            temp = temp.next;
            if (temp != head) {
                System.out.print(" -> ");
            }
        } while (temp != head);
        System.out.println(" -> (تعود للبداية)");
    }
}