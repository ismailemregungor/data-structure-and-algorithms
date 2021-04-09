package stack.stackdemo;

public class StackDemo<T> {

    private int maxSize; // Stack'in max boyutu
    private Object[] stackArray; // Array temelli Stack
    private int top; // Arraydeki en son index

    public StackDemo(int maxSize) {

        this.maxSize = maxSize;
        stackArray = new Object[this.maxSize];
        this.top = -1; // stack tamamen boş

    }

    // Stack'e eleman ekleme
    public void push(Object newItem){

        if (isFull()){

            System.out.println("Stack is Full!");
            return; // olay kesilsin

        }
        top = top + 1; // n. indexe
        stackArray[top] = newItem;
    }

    // Stack dolu mu?
    public boolean isFull(){
        return (top == maxSize -1); // Bu şartlarda Stack dolu demektir.
    }

    // Stack'dan eleman çıkarma
    public T pop(){

        if (isempty()){

            System.out.println("Stack is Empty!");
            return null; // olay bitsin

        }

        // Type Casting
        T newItem = (T) stackArray[top];
        top = top - 1;
        return newItem;
    }

    // Stack boş mu?
    public boolean isempty(){
        return (top == -1); // Bu şartlarda Stack boş demektir.
    }
}
