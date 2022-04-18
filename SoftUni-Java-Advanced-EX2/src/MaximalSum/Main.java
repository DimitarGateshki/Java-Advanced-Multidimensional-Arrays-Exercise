package MaximalSum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String[] input = sc.nextLine().split("\\s+");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        String[] info;
        int[][] biggestMatrix=new int[3][3];

        int[][] matrix=new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            info=sc.nextLine().split("\\s+");
            for (int j = 0; j < cols; j++) {
                matrix[i][j]=Integer.parseInt(info[j]);
            }
        }

        int maxSum=Integer.MIN_VALUE;
        for (int row = 0; row < rows-2; row++) {
            for (int col= 0; col < cols-2; col++) {
                int currentSum=matrix[row][col]+matrix[row][col+1] +matrix[row][col+2]
                        +matrix[row+1][col]+matrix[row+1][col+1]+matrix[row+1][col+2]
                        +matrix[row+2][col]+matrix[row+2][col+1]+matrix[row+2][col+2];
                if (currentSum>maxSum){
                    maxSum=currentSum;
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            biggestMatrix[i][j]=matrix[row+i][col+j];

                        }
                    }
                }

            }
        }

        System.out.println("Sum = "+maxSum);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(biggestMatrix[i][j]+" ");

            }
            System.out.println();
        }
    }
}
