package linkedlists.doublelinkedlist.doublelinkedlistentry;

public class DoubleLinkedList {

    Node headNode;
    Node endNode;

    public DoubleLinkedList() {
        headNode = null;
        endNode = null;
    }

    public void addHead(Node newNode){

        if (headNode == null){

            headNode = newNode;
            endNode = newNode;

        }
        else{

            newNode.next = headNode;
            headNode.previous = newNode;
            headNode = newNode;
        }
    }

    public void addEnd(Node newNode){

        if (headNode == null){

            headNode = newNode;
            endNode = newNode;

        }

        else{

            newNode.previous = endNode;
            endNode.next = newNode;
            endNode = newNode;

        }
    }

    public void addBetween(int range, Node valueToAdd){

        Node reserve = headNode;
        while (reserve.value!=range){
            reserve = reserve.next;

            if (reserve == null){

                System.out.println("Node is not found");

            }
        }
        if (reserve == endNode){

            valueToAdd.next = null;
            endNode = valueToAdd;
        }
        else{
            valueToAdd.next = reserve.next;
            reserve.next.previous = valueToAdd;
        }

        valueToAdd.previous = reserve;
        reserve.next = valueToAdd;
    }

    public void deleteHeadNode(){

        headNode = headNode.next;
        if (headNode.next==null){

            endNode = null;
        }
        else {
            headNode.next.previous = null;
            headNode = headNode.next;
        }
    }

    public void deleteEndNode(){

        if (headNode.next == null){

            headNode = null;

        }
        else{
            endNode.previous.next = null;
            endNode = endNode.previous;
        }
    }

    public void deleteSearchedNode(int searched){

        Node reserve = headNode;

        while(reserve.value!=searched){

            reserve = reserve.next;

            if(reserve == null){

                System.out.println("null!");

            }
        }
        if (reserve == headNode){

            headNode = reserve.next;

        }
        else{
            reserve.previous.next = reserve.next;
        }
    }

    public String display(){

        Node reserve = headNode;
        String list = "";

        while (reserve!=null){

            list = list + reserve.value + "-->";
            reserve = reserve.next;
        }
        return list;
    }

}

