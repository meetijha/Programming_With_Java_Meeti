package ex_04_2DArray;

import java.util.Scanner;

public class P031_Largest_And_Smallest_Num {

    public static void print_largest_and_smallest_num_array(int[][] matrix)
    {
        int largest=Integer.MIN_VALUE;
        int smallest= Integer.MAX_VALUE;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]>largest)
                    largest= matrix[i][j];
                if(matrix[i][j]<smallest)
                    smallest=matrix[i][j];
            }

        }
        System.out.println("Largest ="+largest);
        System.out.println("Smallest ="+ smallest);
    }
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];

        int rows = matrix.length;
        int cols = matrix[0].length;

        //input
        Scanner s = new Scanner(System.in);
        System.out.println("Enter values in array :");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = s.nextInt();
            }
        }
        print_largest_and_smallest_num_array(matrix);
    }
}
