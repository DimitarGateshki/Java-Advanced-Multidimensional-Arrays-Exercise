package FillTheMatrix;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] input=sc.nextLine().split(", ");
        int size=Integer.parseInt(input[0]);
        int[][] matrix=new int[size][size];



        if (input[1].equals("A")){
            buildMatrixA(matrix,size);

        }else {
            buildMatrixB(matrix,size);

        }

        printIt(matrix,size);



    }

    private static void buildMatrixB(int[][] matrix, int size) {
        int count=1;
        for (int cols= 0; cols <size; cols++) {
            if (cols%2==0){
                for (int rows = 0; rows <size; rows++) {
                    matrix[rows][cols]=count++;
                }
            }else {
                for (int rows = size-1; rows >=0; rows--) {
                    matrix[rows][cols] = count++;
                }
            }
        }
    }

    private static void buildMatrixA(int[][] matrix,int size) {
        int count=1;
        for (int cols= 0; cols < size; cols++) {
            for (int rows = 0; rows < size; rows++) {
                matrix[rows][cols]=count++;

            }


        }
    }

    private static void printIt(int[][] matrix,int size) {
        for (int row = 0; row <size ; row++) {
            for (int col = 0; col < size; col++) {
                System.out.print(matrix[row][col]+" ");
            }
            System.out.println();
        }
    }
}
