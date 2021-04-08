package linkedlists.linkedlist.linkedlistdemo;

public class LinkedListDemo<T> {

    NodeDemo headNodeDemo;

    public LinkedListDemo() {

        headNodeDemo = null;
    }

    public void add(Object valueToAdd){

        NodeDemo newNodeDemo = new NodeDemo(valueToAdd,null);
        if (headNodeDemo == null){

            headNodeDemo = newNodeDemo;

        }else {

            newNodeDemo.next = headNodeDemo;
            headNodeDemo = newNodeDemo;
        }
    }

    public void delete(){

        headNodeDemo = headNodeDemo.next;

    }

    public void display(){

        NodeDemo displaynode = headNodeDemo;
        while (displaynode!=null){

            System.out.println((T)displaynode.value);
            displaynode = displaynode.next;

        }
    }
}
