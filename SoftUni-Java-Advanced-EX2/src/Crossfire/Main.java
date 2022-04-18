package Crossfire;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String[] size=sc.nextLine().split("\\s+");
        int rows=Integer.parseInt(size[0]);
        int cols=Integer.parseInt(size[1]);

        List<List<Integer>> matrix = new ArrayList<>();


        int count=1;
        for (int row = 0; row < rows; row++) {
            matrix.add(new ArrayList<>());
            for (int col = 0; col < cols; col++) {
                matrix.get(row).add(count++);
            }
        }

        String token=sc.nextLine();


        int x;
        int y;
        int z;

        while (!token.equals("Nuke it from orbit")){
            String[] tokens=token.split("\\s+");

            x=Integer.parseInt(tokens[0]);
            y=Integer.parseInt(tokens[1]);
            z=Integer.parseInt(tokens[2]);

            for (int i = x - z; i <= x + z; i++) {
                if (isInRange(i, y, matrix) && i != x){
                    matrix.get(i).remove(y);
                }
            }

            for (int i = y + z; i >= y - z; i--) {
                if (isInRange(x, i, matrix)){
                    matrix.get(x).remove(i);
                }
            }
            matrix.removeIf(List::isEmpty);


            token=sc.nextLine();
        }
        for(List<Integer> integers : matrix){
            for (Integer integer : integers) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }}
    private static boolean isInRange(int row, int col, List<List<Integer>> matrix) {
        return row >= 0 && row < matrix.size() && col >= 0 && col < matrix.get(row).size();
    }
}
