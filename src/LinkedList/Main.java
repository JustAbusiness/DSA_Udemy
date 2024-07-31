package LinkedList;


public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(1);

//        myLinkedList.getHead();
//        myLinkedList.getTail();      System.out.println("Head ne: " + head.value);
//        myLinkedList.getLength();

        myLinkedList.append(2);
        myLinkedList.printList();
    }
}