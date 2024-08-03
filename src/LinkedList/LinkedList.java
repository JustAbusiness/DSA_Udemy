package LinkedList;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    class Node
    {
        int value;
        Node next;

        Node(int value)
        {
            this.value = value;
        }
    }

    public LinkedList(int value)
    {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    // Print List
    public void printList()
    {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.value + " ");
            currentNode = currentNode.next;
        }
    }

    // Get Index Of Node
    public Node get(int index)
    {
        if (index < 0 || index >= length)
        {
            return null;
        }

        Node temp = head;
        for (int i = 0; i < index; i++)
        {
            temp = temp.next;
        }
        return temp;
    }


    // Add New Node To List
    public void append(int value)
    {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
//            System.out.println(tail.next.value + " ");
            tail = newNode;
        }
        length++;
    }


    // Prepend Node To List
    public void prepend(int value)
    {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;    // Set newNode equal head, indicating that will be the first of list, head is current number (11)
            head = newNode;         // And then set head to the current newNode ( if set is 3)
        }
        length++;
    }

    public void addLastIndex(int value)
    {
        Node newNode  = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = null;   // Sets the next reference of the new node to null, indicating that it will be the last node in the list.
            tail.next = newNode;  // updates the current tail's next reference to point to the new node.
            tail = newNode;
//            System.out.println("tail" + tail.value);
        }
        length++;
    }


    // Remove Last Node

    public Node removeLast()
    {
        if (length == 0) return null;
        Node temp = head;
        Node prev = head;

        while (temp.next != null)
        {
            prev = temp;
            temp = temp.next;
        }

        // If temp is null
        tail = prev;
        tail.next = null;
        length--;       // If length set is if null then equal to 0

        if (length == 0) {
            head = null;    // Set head, tail to null
            tail = null;
        }
        return temp;
    }

    // Remove First Node
    public Node removeFirst()
    {
        if (length == 0) return null;
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;

        if (length == 0) {
            tail = null;
        }
        return temp;
    }


    // PRINT OUT VALUE OF HEAD AND TAIL

    public void getHead()
    {
        System.out.println("Head: " + head.value);
    }

    public void getTail()
    {
        System.out.println("Tail: " + tail.value);
    }

    public int getLength()
    {
        System.out.println("Length: " + length);
        return 0;
    }
}

