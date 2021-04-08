package linkedlists.doublelinkedlist.doublelinkedlistdemo;

public class MainDemo {

    public static void main(String[] args) {

        DoubleLinkedListsDemo<String> doubleLinkedListsDemo = new DoubleLinkedListsDemo<>();

        doubleLinkedListsDemo.add("İsmail");
        doubleLinkedListsDemo.add("Emre");
        doubleLinkedListsDemo.add("Güngör");
        doubleLinkedListsDemo.display();

        doubleLinkedListsDemo.delete();
        System.out.println("*****Data is Deleted*****");
        doubleLinkedListsDemo.display();

        doubleLinkedListsDemo.delete();
        System.out.println("*****Data is Deleted*****");
        doubleLinkedListsDemo.display();

    }
}
