package stack.stackentry;

public class Stack {

    int maxSize; // Stack'in kapasitesi
    int[] stackArray; // Array temelli Stack
    int top; // Arraydeki en son index

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }

    // Stack dolu mu?
    public boolean isFull(){

         return (top == maxSize -1); // Bu şartlarda Stack dolu demektir.

    }

    // Stack boş mu mu?
    public boolean isEmpty(){
        return (top == -1); // Bu şartlarda Stack boş demektir.
    }

    // Stack'e eleman ekleme
    public void push(int newItem){

        if (isFull()){

            System.out.println("Stack is Full!");

        }
        else if (!isFull()){

            top = top + 1;
            stackArray[top] = newItem;
            System.out.println(newItem);

        }
    }

    // Stack'den eleman silme
    int pop(){

        if(isEmpty()){

            System.out.println("Stack is Empty!");

        }

        else if (!isEmpty()){

            top = top -1;
            System.out.println(stackArray[top + 1]);
            return stackArray[top + 1];

        }
        return -1;
    }
}
