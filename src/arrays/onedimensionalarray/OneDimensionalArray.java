package arrays.onedimensionalarray;

public class OneDimensionalArray {

    public static void main(String[] args) {

        int numbers[] = new int[500000];

        long firstTıme = System.nanoTime();

        for (int i = 0; i<numbers.length; i++){
            numbers[i] = i;
        }

        long secondTıme = System.nanoTime();

        System.out.println(numbers[2000]);
        long thirdTıme = System.nanoTime();

        System.out.println(numbers[0]);
        long fourthTıme = System.nanoTime();


        for (int i = 0; i<numbers.length; i++){

            System.out.println(numbers[i]);
        }
        long fifthTıme = System.nanoTime();

        System.out.println("First loop  : " + (secondTıme - firstTıme));
        System.out.println("Second loop - Sout : " + (fifthTıme - fourthTıme));
        System.out.println("Random Access 1  : " + (thirdTıme - secondTıme));
        System.out.println("Random Access 1  : " + (fourthTıme - thirdTıme));

    }
}
