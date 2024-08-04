package LinkedList;


public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(7);

//        myLinkedList.getHead();
//        myLinkedList.getTail();      System.out.println("Head ne: " + head.value);
//        myLinkedList.getLength();

        myLinkedList.append(8);
        myLinkedList.append(9);
//        myLinkedList.append(10);


        myLinkedList.remove(3);
//        myLinkedList.insert(0, 6);
//        myLinkedList.set(2, 11);

//        System.out.println(myLinkedList.get(0).value + "\n");
//
//        myLinkedList.prepend(5);
//
//        myLinkedList.addLastIndex(12);

//        myLinkedList.removeLast();

//        myLinkedList.removeFirst();


        myLinkedList.printList();
    }
}