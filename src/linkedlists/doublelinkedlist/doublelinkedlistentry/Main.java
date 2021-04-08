package linkedlists.doublelinkedlist.doublelinkedlistentry;

public class Main {

    public static void main(String[] args) {

        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();

        Node node = new Node(1);
        doubleLinkedList.addHead(node);

        Node node1 = new Node(10);
        doubleLinkedList.addHead(node1);

        Node node2 = new Node(40);
        doubleLinkedList.addEnd(node2);

        Node node3 = new Node(20);
        doubleLinkedList.addBetween(10, node3);

        System.out.println(doubleLinkedList.display());
        System.out.println("***********************");

        doubleLinkedList.deleteSearchedNode(1);
        System.out.println(doubleLinkedList.display());
        System.out.println("***********************");

    }
}
