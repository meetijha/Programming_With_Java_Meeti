package ex_04_2DArray;

import java.util.Scanner;

public class P030_2D_Array_Creation {

    public static void main(String[] args) {
        int[][] matrix= new int[3][3];

        int rows= matrix.length;
        int cols= matrix[0].length;

        //input
        Scanner s= new Scanner(System.in);
        for(int i=0;i<rows;i++) {
            for (int j=0;j<cols;j++)
            {
                System.out.println("Enter value at ["+i+","+j+"]");
                matrix[i][j]=s.nextInt();
            }
        }

       //output
        for(int i=0;i<rows;i++) {
            for (int j=0;j<cols;j++)
            {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

    }
}
