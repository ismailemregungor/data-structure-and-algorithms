package linkedlists.linkedlist.linkedlistdemo;

public class MainDemo {

    public static void main(String[] args) {

        LinkedListDemo<String> linkedListDemo = new LinkedListDemo<>();

        linkedListDemo.add("İsmail");
        linkedListDemo.add("Emre");
        linkedListDemo.add("Güngör");
        linkedListDemo.display();

        linkedListDemo.delete();
        System.out.println("*****Data is Deleted*****");
        linkedListDemo.display();

        linkedListDemo.delete();
        System.out.println("*****Data is Deleted*****");
        linkedListDemo.display();



    }
}
