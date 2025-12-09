package ex_04_2DArray;

public class P034_Serach_In_SortedMatrix {

    public static void main(String[] args) {


        int[][] matrix = {{10, 20, 30, 40}
                , {15, 25, 35, 45}
                , {27, 29, 37, 48}
                , {32, 33, 39, 50}};
        int key=33;
        staircaseSearch(matrix,key);
    }

    public static boolean staircaseSearch(int[][] matrix, int key){
        int row=0,col=matrix[0].length-1;
        // Making top right element as starting point
        while(row<matrix.length && col>=0 )
        {
            if(key>matrix[row][col])
            {
                row++;
            }
            else if(key<matrix[row][col])
            {
                col--;
            }
            else if(key==matrix[row][col])
            {
                System.out.println("Found key at "+"["+row+","+col+"]");
                return true;
            }
        }
        System.out.println("Key not found!");
        return false;

        /* Another approach:
        If we make bottom left element as starting point
        if (key>matrix[row][col]) --> col++
        if(key<matrix[row][col]) -->row--
        */
    }
}
