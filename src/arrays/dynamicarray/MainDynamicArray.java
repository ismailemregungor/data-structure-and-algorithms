package arrays.dynamicarray;

public class MainDynamicArray {

    public static void main(String[] args) {

        DynamicArray<Integer> dynamicArray = new DynamicArray<>();

        System.out.println("Size : " + dynamicArray.getSize());
        dynamicArray.put(1);
        System.out.println("Size : " + dynamicArray.getSize());
        dynamicArray.put(2);
        System.out.println("Size : " + dynamicArray.getSize());
        dynamicArray.put(3);
        System.out.println("Size : " + dynamicArray.getSize());
        dynamicArray.put(4);
        System.out.println("Size : " + dynamicArray.getSize());
        dynamicArray.put(5);
        System.out.println("Size : " + dynamicArray.getSize());

        for (int i = 0; i<dynamicArray.getSize(); i++){

            System.out.println("Element : " + dynamicArray.get(i));

        }
    }
}
