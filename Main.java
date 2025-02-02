public class Main {
    public static void main(String[] args) {
        LLDeleteMethod list = new LLDeleteMethod();

        // Add nodes to the list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Original List:");
        list.printList();

        // Delete first node
        list.deleteFirst();
        System.out.println("After deleting the first node:");
        list.printList();

        // Delete last node
        list.deleteLast();
        System.out.println("After deleting the last node:");
        list.printList();

        // Delete a node with value 3
        list.deleteNode(3);
        System.out.println("After deleting node with value 3:");
        list.printList();
    }
}
