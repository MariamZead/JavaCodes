import java.util.LinkedHashSet;

public class BulkOperations {
    public static void main(String[] args) {
        LinkedHashSet <Integer> myList1 = new LinkedHashSet<>();
        myList1.add(3);
        myList1.add(4);
        myList1.add(5);
        myList1.add(2);
        LinkedHashSet <Integer> myList2 = new LinkedHashSet<>();
        myList2.add(2);
        myList2.add(3);
        myList2.add(7);
        myList2.add(8);

        System.out.println("Set 1 : " +myList1);
        System.out.println("Set 2 : " + myList2);
        LinkedHashSet <Integer> union = new LinkedHashSet<>(myList1);
        union.addAll(myList2);
        System.out.println("s1 union s2 " + union);
        LinkedHashSet <Integer> intersect = new LinkedHashSet<>(myList1);
        intersect.retainAll(myList2);
        System.out.println("s1 intersect s2 " + intersect);
        LinkedHashSet <Integer> difference = new LinkedHashSet<>(myList1);
        difference.retainAll(myList2);
        System.out.println("s1 difference s2 " + difference);
    }
}
