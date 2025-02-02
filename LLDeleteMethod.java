public class LLDeleteMethod {
    public Node head;
    public Node tail;

    public LLDeleteMethod() {
        head = null;
        tail = null;
    }

    // Add a new node to the list
    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }


    // Delete the first node in the list
    public void deleteFirst() {
        if (head == null) {
            return;
        }

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    // Delete the last node
    public void deleteLast() {
        if (head == null) {
            return;
        }

        if (head == tail) {
            head = tail = null;
        } else {
            Node temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }

    // Delete a node by its value
    public void deleteNode(int value) {
        if (head == null) {
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.value != value) {
            temp = temp.next;
        }

        // If the node is found, delete it
        if (temp.next != null) {
            if (temp.next == tail) {
                tail = temp;
            }
            temp.next = temp.next.next;
        }
    }

    // Method to print the linked list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            if (temp.next == null) {
                System.out.print(temp.value);
            } else {
                System.out.print(temp.value + " -> ");
            }
            temp = temp.next;
        }
        System.out.println();
    }
}
