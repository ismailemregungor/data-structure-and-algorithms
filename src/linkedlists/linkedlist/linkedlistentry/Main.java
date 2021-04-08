package linkedlists.linkedlist.linkedlistentry;

public class Main {

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();

        Node node = new Node(1);
        linkedList.addHead(node);

        Node node1 = new Node(10);
        linkedList.addHead(node1);

        Node node2 = new Node(40);
        linkedList.addEnd(node2);

        Node node3 = new Node(20);
        linkedList.addBetween(node3, 10);

        Node node4 = new Node(30);
        linkedList.addBetween(node4, 20);

        Node node5 = new Node(25);
        linkedList.addInOrder(node5);

        Node node6 = new Node(22);
        linkedList.addInOrder(node6);

        Node node7 = new Node(50);
        linkedList.addEnd(node7);

        System.out.println(linkedList.display());
        System.out.println("***********************");

        linkedList.deleteSearchedNode(1);
        System.out.println(linkedList.display());
        System.out.println("***********************");

    }
}
