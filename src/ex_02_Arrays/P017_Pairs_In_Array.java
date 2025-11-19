package ex_02_Arrays;

public class P017_Pairs_In_Array {
    public static void main(String[] args) {
        int[] arr={2,5,8,12,7,9};
        printPairsInArray(arr);
    }

    public static void printPairsInArray(int[] arr)
    {

        //Time Complexity - O(n^2) as 2 loops are running
        // first loop n times
        // second loop n-1, n-2 , n-3 and so on times
        int totalPairs=0;
        for(int i=0;i<arr.length;i++)
        {
            int currElement=arr[i];
            for(int j=i+1;j<arr.length;j++)
            {
                System.out.print("("+currElement+","+arr[j]+") ");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("Total number of pairs are "+totalPairs);
    }
}
