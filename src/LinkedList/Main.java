package LinkedList;


public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(7);

//        myLinkedList.getHead();
//        myLinkedList.getTail();      System.out.println("Head ne: " + head.value);
//        myLinkedList.getLength();

        myLinkedList.append(8);
        myLinkedList.append(9);

        System.out.println(myLinkedList.get(1).value + "\n");
//
//        myLinkedList.prepend(5);
//
//        myLinkedList.addLastIndex(12);

//        myLinkedList.removeLast();

//        myLinkedList.removeFirst();


        myLinkedList.printList();
    }
}