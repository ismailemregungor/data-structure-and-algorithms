package queue.queuedemo;

public class MainQueueArrayDemo {

    public static void main(String[] args) {

        QueueArrayDemo<Integer> queueArrayDemo = new QueueArrayDemo<>(4);

        queueArrayDemo.enQueue(1);
        queueArrayDemo.enQueue(2);
        queueArrayDemo.enQueue(3);
        System.out.println(queueArrayDemo.deQueue()); // --> İlk giren ilk çıkar 1
        System.out.println(queueArrayDemo.deQueue()); // --> İlk giren ilk çıkar 2
        queueArrayDemo.enQueue(4);
        queueArrayDemo.enQueue(5);
        queueArrayDemo.printer();



        //queueDemo.deQueue(); // Queue is Empty!
        /*queueDemo.enQueue(1);
        queueDemo.enQueue(2);
        queueDemo.enQueue(3);
        queueDemo.enQueue(4);
        queueDemo.enQueue(5); // > Queue is Full!
        queueDemo.printer();*/


    }
}
