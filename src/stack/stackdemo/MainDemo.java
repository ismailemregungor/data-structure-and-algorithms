package stack.stackdemo;

public class MainDemo {

    public static void main(String[] args) {

        StackDemo<Integer> stackDemo = new StackDemo<>(5);
        stackDemo.push(1);
        stackDemo.push(2);
        stackDemo.push(3);
        stackDemo.push(4);
        stackDemo.push(5);
       // stackImplDemo.push(6);

        while (!stackDemo.isempty()){

           int value =  stackDemo.pop();
           System.out.println(value);

        }
        //stackImplDemo.pop();


    }
}
