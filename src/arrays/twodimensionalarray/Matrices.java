package arrays.twodimensionalarray;

import java.util.Scanner;

class Matrices{

    int matrix[][];
    int row, column;

    public void create(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Number of rows:");
        row = Integer.parseInt(scanner.nextLine());

        System.out.println("Number of columns:");
        column = Integer.parseInt(scanner.nextLine());

        matrix = new int[row][column];

        System.out.println("Enter numbers : ");
        for (int i = 0; i<row; i++){

            for (int j = 0; j<column; j++){

                matrix[i][j] = scanner.nextInt();

            }

        }
        scanner.close();

    }

    public void display(){

        System.out.println();
        System.out.println("Matrix is :");

        for (int i = 0; i<row; i++){

            for (int j = 0; j<column; j++){

                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }
    }
}
