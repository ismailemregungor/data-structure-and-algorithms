package queue.queuedemo;

public class QueueArrayDemo<T> {

    Object[] arrayQueue;
    int front, rear, maxSize, nItems;

    public QueueArrayDemo(int size) {
        this.maxSize = size;
        arrayQueue = new Object[this.maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void enQueue(Object newObject){

        if (isFull()){

            System.out.println("Queue is Full!");
            return;
        }

        rear++;
        arrayQueue[rear] = newObject;
        nItems++;
    }

    public T deQueue(){

        if(isEmpty()){

            System.out.println("Queue is Empty!");
            return null;

        }

        T objectOut = (T) arrayQueue[front];

        for (int i = 1; i< (rear + 1); i++){

            T temp = (T) arrayQueue[i];
            arrayQueue[i-1] = temp;

        }
        arrayQueue[rear] = null;
        nItems--;
        rear--;
        return objectOut;
    }

    public boolean isEmpty() {

        return (nItems == 0);

    }

    // Kuyruk dolu mu?
    public boolean isFull() {

        return (nItems == maxSize);

    }

    public void printer(){

        System.out.println("Listing the elements in the queue...");

        for (int i = 0; i<arrayQueue.length; i++){

            System.out.println("Element Order ["+ (i + 1) +"] " + arrayQueue[i]);

        }
    }
}
