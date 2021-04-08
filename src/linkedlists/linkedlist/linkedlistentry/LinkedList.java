package linkedlists.linkedlist.linkedlistentry;

public class LinkedList {

    Node headNode; // Baştaki düğümü tutacak.
    Node endNode; // Sondaki düğümü tutacak.

    // Bağlı listemizi başlatacak.
    public LinkedList() {
        headNode = null;
        endNode = null;
    }

    // Başa yeni düğüm ekle
    public void addHead(Node newNode){

        // Eğer hiç eleman yoksa yeni gelen eleman hem baş düğüm hem son düğüm olur.
        if (headNode == null){

            headNode = newNode;
            endNode = newNode;

        }
        // Eğer eleman varsa yeni gelen eleman baş düğümü gösterir ayrıca artık yeni baş düğümde kendisi our.
        else{

            newNode.next = headNode;
            headNode = newNode;

        }
    }

    // Sona yeni düğüm ekle
    public void addEnd(Node newNode){

        // Eğer hiç eleman yoksa yeni gelen eleman hem baş düğüm hem son düğüm olur.
        if (headNode == null){

            headNode = newNode;
            endNode = newNode;

        }
        // Eğer eleman varsa yeni gelen eleman son düğümü gösterir ayrıca artık yeni son düğümde kendisi our.
        else{

            endNode.next = newNode;
            endNode = newNode;

        }
    }
    /*
        Bağlı liste içinde aranana düğümü bulup, o düğümün arkasına yeni bir düğüm eklenir.
     */
    public void addBetween(Node newNode, int searched){

        Node temp = headNode;
        while (temp.next!=null){

            if (temp.value == searched){

                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }
            else{
                temp = temp.next;
            }
        }
        // Eğer sondaysa aradığmız eleman sona ekleme yapıyoruz.
        if(temp == endNode && temp.value == searched){
            endNode.next = newNode ;
            endNode = newNode;
        }
    }

     /*
        Yeni bir düğümü sıralı bir şekilde küçükten büyüğe ekleyelim.
    */
    public void addInOrder(Node newNode){

        if(headNode == null){
            headNode = newNode;
        }
        else {
            Node reserve = headNode;
            Node reserveNode = null ;


            /*
                 Gezinme işleminde kullandığımız 'yedek' değişkeni boş olmadığı ve yeni gelen sayımız bir önceki elemandan büyük olduğu sürece
                 bu döngü içerisine girecek.
             */

            while(reserve!=null && reserve.value < newNode.value){
                if(reserve.value < newNode.value){
                    reserveNode = reserve ;
                    reserve = reserve.next;
                }
                else break ;
            }
            if (reserveNode == null){
                reserve.next = reserve ;
                headNode = newNode ;
            }

            /*
                 Eğer daha önceden bir eleman varsa yeni gelen elemanın ilerisi artık bir önceki elemanın ilerisini gösterecek
                 bir önceki elemanın ileriside artık yeni eleman olacağından dolayı bir nevi 'araya ekleme' olacak.
             */

            else {
                newNode.next = reserveNode.next ;
                reserveNode.next = newNode;
            }
        }
    }

    // İlk Düğüm bir sonraki düğümü gösterdiğinde o düğümü artık silmiş oluyoruz.
    public void deleteHeadNode(){

        headNode = headNode.next;
        if (headNode==null){

            endNode = null;

        }
    }

     /*
         Son'dan önceki düğümü son düğüm halina getirirsek sondaki düğümü silmiş oluruz.
         Sondan önceki düğüme liste içinde gezinme yaparak gideriz.
    */
    public void deleteEndNode(){

        Node temp = headNode;
        Node tempNode = null;

        while(temp!= endNode){

            tempNode = temp;
            temp = temp.next;

        }
        if (tempNode == null){

            headNode = null;

        }
        else{
            tempNode.next = null;
            headNode = tempNode;
        }
    }

     /*
        Aradığımız düğümü bulduğumuzda öncesinde bulunan düğümle aradığımız düğümün bir sonraki düğümü
        arasındaki bağlantıyı yaparak aradığımız düğümü silmiş olucaz, özetle yok edicez.
    */

    public void deleteSearchedNode(int searched){

        Node reserve = headNode;
        Node reserveNode = null;

        while(reserve!=null){

            if(reserve.value == searched){
                break;
            }
            else {
                reserveNode = reserve ;
                reserve = reserve.next;
            }
        }
        if(reserveNode == null){
            headNode = headNode.next;
        }
        else if(reserveNode !=null){
            reserveNode.next = reserve.next;
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
