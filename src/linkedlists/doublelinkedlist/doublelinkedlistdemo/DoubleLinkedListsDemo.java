package linkedlists.doublelinkedlist.doublelinkedlistdemo;

public class DoubleLinkedListsDemo<T> {

    NodeDemo headNodeDemo;

    public DoubleLinkedListsDemo() {

        headNodeDemo = null;
    }

    public void add(Object valueToAdd){

        NodeDemo newNodeDemo = new NodeDemo(valueToAdd,null, null);
        if (headNodeDemo == null){

            headNodeDemo = newNodeDemo;

        }else {

            newNodeDemo.next = headNodeDemo;
            headNodeDemo.previous = newNodeDemo;
            headNodeDemo = newNodeDemo;
        }
    }

    public void delete(){

        headNodeDemo = headNodeDemo.next;
        headNodeDemo.previous = null;

    }

    public void display(){

        NodeDemo displaynode = headNodeDemo;
        while (displaynode!=null){

            System.out.println((T)displaynode.value);
            displaynode = displaynode.next;
            // displaynode = displaynode.previous;
        }
    }
}
