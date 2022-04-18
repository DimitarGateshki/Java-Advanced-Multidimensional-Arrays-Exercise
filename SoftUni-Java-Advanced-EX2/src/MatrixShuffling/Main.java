package MatrixShuffling;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String[] size=sc.nextLine().split("\\s+");
        int row=Integer.parseInt(size[0]);
        int coll=Integer.parseInt(size[1]);

        String[] tokens;

        String[][] matrix=new String[row][coll];

        for (int i = 0; i < row; i++) {
            tokens=sc.nextLine().split("\\s+");
            for (int j = 0; j < coll; j++) {
                matrix[i][j]=tokens[j];
            }
        }


        String temp="";

        int x1;
        int y1;
        int x2;
        int y2;

        tokens=sc.nextLine().split("\\s+");
        while (!tokens[0].equals("END")){

            if (tokens[0].equals("swap") && tokens.length==5){
                x1=Integer.parseInt(tokens[1]);
                y1=Integer.parseInt(tokens[2]);
                x2=Integer.parseInt(tokens[3]);
                y2=Integer.parseInt(tokens[4]);

                if (x1<row && x2 <row && y1<coll && y2<coll){
                    if (x1>=0 && x2 >=0 && y1>=0 && y2>=0){
                        temp=matrix[x1][y1];
                        matrix[x1][y1]=matrix[x2][y2];
                        matrix[x2][y2]=temp;
                        printMatrix(matrix,row,coll);


                    }else {
                        System.out.println("Invalid input!");

                    }

                }else {
                    System.out.println("Invalid input!");
                }


            }else {
                System.out.println("Invalid input!");
            }

            tokens=sc.nextLine().split("\\s+");
        }
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
