package StringMatrixRotation;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String rotate=sc.nextLine();
        int angle=Integer.parseInt(rotate.split("[()]+")[1])%360;
        String input=sc.nextLine();
        ArrayList<String> words=new ArrayList<>();
        int maxLength=Integer.MIN_VALUE;
        while (!input.equals("END")){
            words.add(input);
            if (input.length()>maxLength){
                maxLength=input.length();
            }
            input=sc.nextLine();

        }
        char[][] matrix = new char[words.size()][maxLength];
        fillM(matrix,words,maxLength);


        if (angle == 90){
            for (int i = 0; i < maxLength; i++) {
                for (int j = matrix.length-1; j >=0 ; j--) {
                    System.out.print(matrix[j][i]);

                }
                System.out.println();

            }

        }else if (angle==180){
            for (int i = matrix.length-1; i >=0 ; i--) {
                for (int j = maxLength-1; j >=0 ; j--) {
                    System.out.print(matrix[i][j]);
                }
                System.out.println();
            }

        }else if (angle==270){
            for (int i = maxLength-1; i >=0 ; i--) {
                for (int j = 0; j <matrix.length; j++) {
                    System.out.print(matrix[j][i]);
                }
                System.out.println();
            }

        }else {
            printIt(matrix,matrix.length,maxLength);
        }





    }

    private static void fillM(char[][] matrix, ArrayList<String> words, int max) {
        String current="";
        for (int i = 0; i <matrix.length ; i++) {
            current=words.get(i);
            for (int j = 0; j <max; j++) {
                if (j<current.length()) {
                    matrix[i][j] = current.charAt(j);
                }else {
                    matrix[i][j]=' ';
                }
            }
        }
    }


    private static void printIt(char[][] matrix, int rows, int cols) {
        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j <cols ; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

}
