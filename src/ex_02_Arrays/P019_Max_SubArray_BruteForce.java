package ex_02_Arrays;

public class P019_Max_SubArray_BruteForce {
    public static void main(String[] args) {
        int[] arr={2,-1,6,-1,3};// max subarrary is (6,-1,3)
        int maxSubArraySUm=getMaxSubArray(arr);
        System.out.println("Max sub array sum is "+ maxSubArraySUm);
    }

    public static int getMaxSubArray(int [] arr)
    {
        // Time Complexity - O(n^3)
        int maxSubArrySum= Integer.MIN_VALUE;

         for(int i=0;i<arr.length;i++)
         {
             for(int j=i;j<arr.length;j++)
             {
                 int currentSum=0;
                 for(int k=i;k<=j;k++)
                 {
                     currentSum=currentSum+arr[k];
                     System.out.print(arr[k]+" ");
                 }
                 if(currentSum>maxSubArrySum)
                     maxSubArrySum=currentSum;
                 System.out.println();
             }
             System.out.println();
         }
        return maxSubArrySum;
    }
}
