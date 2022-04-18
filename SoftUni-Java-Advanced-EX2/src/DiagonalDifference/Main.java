package DiagonalDifference;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int size=Integer.parseInt(sc.nextLine());

        int[][] matrix=new int[size][size];

        String[] info;

        for (int i = 0; i < size; i++) {
            info=sc.nextLine().split("\\s+");
            for (int j = 0; j < info.length; j++) {
                matrix[i][j]=Integer.parseInt(info[j]);
            }
        }


        int sum2=diagonalSum2(matrix);
        int sum1=diagonalSum1(matrix);

        int end=sum1-sum2;
        if (end<0){
            end*=-1;
        }
        System.out.println(end);
    }

    private static int diagonalSum2(int[][] matrix) {
        int sum=0;
        for (int i = 0; i < matrix.length; i++) {
            sum+=matrix[i][matrix.length-1-i];
        }
        return sum;
    }

    private static int diagonalSum1(int[][] matrix) {
        int sum=0;
        for (int i = 0; i < matrix.length; i++) {
            sum+=matrix[i][i];
        }
        return sum;
    }
}
