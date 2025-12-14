package Assignment_1;

// الملف الرئيسي لتشغيل البرنامج
public class Main {

    public static void main(String[] args) {
        System.out.println("=== بداية البرنامج ===");
        System.out.println("الطالب:محمد يحيى القاضي -التخصص-الامن السبراني- المجموعة: G4\n");

        // اختبار السؤال 2
        System.out.println("1. السؤال 2: حذف عنصر عشوائي من المصفوفة");
        System.out.println("----------------------------------------");
        Question2 q2 = new Question2();
        int[] arr = {1, 2, 3, 4, 5};
        System.out.print("المصفوفة الأصلية: ");
        q2.printArray(arr);
        int[] result = q2.removeRandom(arr);
        System.out.print("بعد الحذف: ");
        q2.printArray(result);
        System.out.println();

        // اختبار السؤال 4
        System.out.println("2. السؤال 4: قلب ترتيب المصفوفة");
        System.out.println("----------------------------------------");
        Question4 q4 = new Question4();
        int[] arr2 = {10, 20, 30, 40, 50};
        System.out.print("قبل العكس: ");
        q4.printArray(arr2);
        q4.reverse(arr2);
        System.out.print("بعد العكس: ");
        q4.printArray(arr2);
        System.out.println();

        // اختبار السؤال 6
        System.out.println("3. السؤال 6: تدوير القائمة المرتبطة");
        System.out.println("----------------------------------------");
        Question6 q6 = new Question6();
        // إضافة عناصر
        System.out.print("إضافة العناصر: ");
        int[] elements6 = {1, 2, 3, 4, 5};
        for (int num : elements6) {
            q6.add(num);
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.print("القائمة الأصلية: ");
        q6.printList();
        q6.rotate(2);
        System.out.print("بعد تدوير 2 موقع: ");
        q6.printList();
        System.out.println();

        // اختبار السؤال 8
        System.out.println("4. السؤال 8: البحث عن موقع عنصر في القائمة");
        System.out.println("----------------------------------------");
        Question8 q8 = new Question8();
        // إضافة عناصر
        System.out.print("إضافة العناصر: ");
        int[] elements8 = {100, 200, 300, 400, 500};
        for (int num : elements8) {
            q8.add(num);
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.print("القائمة: ");
        q8.printList();

        int searchValue = 200;
        int index = q8.findIndex(searchValue);
        System.out.println("موقع " + searchValue + " هو: " + index);

        searchValue = 600;
        index = q8.findIndex(searchValue);
        System.out.println("موقع " + searchValue + " هو: " + index + " (غير موجود)");
        System.out.println();

        // اختبار السؤال 10
        System.out.println("5. السؤال 10: حذف العناصر المكررة من القائمة الثنائية");
        System.out.println("----------------------------------------");
        Question10 q10 = new Question10();
        // إضافة عناصر
        System.out.print("إضافة العناصر: ");
        int[] elements10 = {1, 2, 2, 3, 3, 3, 4};
        for (int num : elements10) {
            q10.add(num);
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.print("قبل حذف التكرارات: ");
        q10.printList();
        q10.removeDuplicates();
        System.out.print("بعد حذف التكرارات: ");
        q10.printList();
        System.out.println();

        // اختبار السؤال 12
        System.out.println("6. السؤال 12: البحث في القائمة المرتبطة الثنائية");
        System.out.println("----------------------------------------");
        Question12 q12 = new Question12();
        // إضافة عناصر
        System.out.print("إضافة العناصر: ");
        int[] elements12 = {5, 15, 25, 35};
        for (int num : elements12) {
            q12.add(num);
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.print("القائمة: ");
        q12.printList();

        int searchVal = 25;
        boolean found = q12.search(searchVal);
        System.out.println("هل " + searchVal + " موجود؟ " + (found ? "نعم ✓" : "لا ✗"));

        searchVal = 100;
        found = q12.search(searchVal);
        System.out.println("هل " + searchVal + " موجود؟ " + (found ? "نعم ✓" : "لا ✗"));
        System.out.println();

        // اختبار السؤال 14
        System.out.println("7. السؤال 14: حذف عقدة من قائمة دائرية");
        System.out.println("----------------------------------------");
        Question14 q14 = new Question14();
        // إضافة عناصر
        System.out.print("إضافة العناصر: ");
        int[] elements14 = {100, 200, 300, 400, 500};
        for (int num : elements14) {
            q14.add(num);
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.print("القائمة الأصلية: ");
        q14.printList();

        int deletePosition = 3;
        System.out.println("حذف العنصر في الموضع: " + deletePosition);
        q14.deleteAt(deletePosition);
        System.out.print("بعد الحذف: ");
        q14.printList();
        System.out.println();

        // اختبار السؤال 16
        System.out.println("8. السؤال 16: تقسيم القائمة الدائرية إلى نصفين");
        System.out.println("----------------------------------------");
        Question16 q16 = new Question16();
        // إضافة عناصر
        System.out.print("إضافة العناصر: ");
        int[] elements16 = {10, 20, 30, 40, 50, 60};
        for (int num : elements16) {
            q16.add(num);
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.print("القائمة الأصلية: ");
        q16.printList();

        System.out.println("\nنتيجة التقسيم:");
        q16.splitList();

        System.out.println("\n=== نهاية البرنامج ===");
    }
}