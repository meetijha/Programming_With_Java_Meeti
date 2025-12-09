package ex_04_2DArray;

public class P035_Transpose_Matrix {

    public static void main(String[] args) {

        int[][] matrix={{1,2,3},
                        {4,5,6}};

        int[][] transposedMatrix=transposematrix(matrix);
        printMatrix(transposedMatrix);
    }

   public static int[][] transposematrix(int[][] matrix)
   {
       int row=matrix.length;
       int col=matrix[0].length;

       int[][] matrix1= new int[col][row];
       for(int i=0;i<row;i++)
       {
           for(int j=0;j<col;j++)
           {
               matrix1[j][i]=matrix[i][j];
           }
       }
       return matrix1;
   }

   public static void printMatrix(int[][] matrix)
   {
       for(int i=0;i<matrix.length;i++) {
           for (int j=0;j<matrix[0].length;j++)
           {
               System.out.print(matrix[i][j]);
           }
           System.out.println();
       }
   }
}
