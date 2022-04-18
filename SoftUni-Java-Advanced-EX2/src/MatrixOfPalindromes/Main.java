package MatrixOfPalindromes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String[] input=sc.nextLine().split("\\s+");
        int rows=Integer.parseInt(input[0]);
        int cols=Integer.parseInt(input[1]);
        String[][] matrix=new String[Integer.parseInt(input[0])][Integer.parseInt(input[1])];
        char start='a';

        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j < cols; j++) {
                String current="" + start+(char)(start+j)+start;
                matrix[i][j]=current;
            }
            start=(char)(start+1);
        }

        printMatrix(matrix,rows,cols);




    }



    private static void printMatrix(String[][] matrix,int rows,int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }
    }

}
