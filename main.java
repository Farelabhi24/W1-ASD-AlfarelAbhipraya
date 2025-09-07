public class main {
    public static void main(String[] args) {
        System.out.println("===== Singly Linked List =====");
        SinglyLinkedList sll = new SinglyLinkedList();

        // Tambahkan data
        sll.add("A");
        sll.add("B");
        sll.add("C");
        sll.add("D");
        sll.printList();  // A -> B -> C -> D -> null

        // insertAt
        System.out.println();
        System.out.println("Insert 'X' at index 2:");
        sll.insertAt(2, "X");
        sll.printList();  // A -> B -> X -> C -> D -> null

        // removeAt
        System.out.println();
        System.out.println("Remove data at index 3:");
        sll.removeAt(3);
        sll.printList();  // A -> B -> X -> D -> null

        // get
        System.out.println();
        System.out.println("Data at index 2: " + sll.get(2)); // X

        // contains
        System.out.println();
        System.out.println("Contains 'D'? " + sll.contains("D")); // true
        System.out.println("Contains 'C'? " + sll.contains("C")); // false

        // indexOf
        System.out.println();
        System.out.println("Index of 'B': " + sll.indexOf("B")); // 1
        System.out.println("Index of 'Z': " + sll.indexOf("Z")); // -1

        System.out.println("\n===== Doubly Linked List =====");
        DoublyLinkedList dll = new DoublyLinkedList();

        // Tambahkan data
        System.out.println();
        dll.add(1);
        dll.add(2);
        dll.add(3);
        dll.add(4);
        dll.printList();  // 1 <-> 2 <-> 3 <-> 4 <-> null

        // insertAt
        System.out.println();
        System.out.println("Insert 99 at index 2:");
        dll.insertAt(2, 99);
        dll.printList();  // 1 <-> 2 <-> 99 <-> 3 <-> 4 <-> null

        // removeAt
        System.out.println();
        System.out.println("Remove data at index 3:");
        dll.removeAt(3);
        dll.printList();  // 1 <-> 2 <-> 99 <-> 4 <-> null

        // get
        System.out.println();
        System.out.println("Data at index 1: " + dll.get(1)); // 2

        // contains
        System.out.println();
        System.out.println("Contains 4? " + dll.contains(4));   // true
        System.out.println("Contains 10? " + dll.contains(10)); // false

        // indexOf
        System.out.println();
        System.out.println("Index of 99: " + dll.indexOf(99)); // 2
        System.out.println("Index of 7: " + dll.indexOf(7));   // -1
    }
}