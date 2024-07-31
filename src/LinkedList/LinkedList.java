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

    // Add New Node To List
    public void append(int value)
    {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
//        System.out.println("tail" + tail.value);
        length++;
    }



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

