package ex_02_Arrays;

public class P020_Max_SubArraySum_PrefixSum {
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        getMaxSubArraySum_PrefixSum(arr);
    }

    public static void getMaxSubArraySum_PrefixSum(int[] arr) {
        int[] prefixArr = new int[arr.length];
        int currSum=0;
        int maxSUm=Integer.MIN_VALUE;
        prefixArr[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixArr[i] = prefixArr[i - 1] + arr[i];
        }
        int maxSum=Integer.MIN_VALUE;
        for (int i = 0; i < prefixArr.length; i++) {
            int start=i;
            for (int j = i; j < prefixArr.length; j++) {
                int end=j;
                currSum=start==0? prefixArr[j]:prefixArr[end]-prefixArr[start-1];

                if(maxSum < currSum)
                    maxSum=currSum;
            }
        }
        System.out.println("Max sum = "+maxSum);
    }
}
