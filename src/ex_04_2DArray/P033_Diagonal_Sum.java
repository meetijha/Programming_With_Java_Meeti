package ex_04_2DArray;

public class P033_Diagonal_Sum {
    public static void main(String[] args) {
        int[][] matrix={{1,2,3,4}
        ,{5,6,7,8}
        ,{9,10,11,12}
        ,{13,14,15,16}};

        diagonalSum(matrix);

    }
    public static void diagonalSum(int[][] matrix)
    {
        int sum=0;
        int extra=0;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(i==j)//primary diagonal
                {
                    sum=sum+matrix[i][j];
                }
                else if(i+j==matrix.length-1)//secondary diagonal
                {
                    sum=sum+matrix[i][j];
                }
            }

        }
        System.out.println("Sum= "+sum);

        //More optimised solution
        sum=0;
        int n=matrix.length;
        for(int i=0;i<n;i++)
        {
            //primary diagonal
            sum=sum+matrix[i][i];
            //secondary diagonal
            if(i!=n-1-i)
            sum=sum+matrix[n-1-i][i];
        }
        System.out.println("Sum= "+sum);
    }
}
