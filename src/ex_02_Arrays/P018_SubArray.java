package ex_02_Arrays;

public class P018_SubArray {
    public static void main(String[] args) {

        int[] arr={2,4,6,8,10};
        printSubArray(arr);
    }

    public static void printSubArray(int[] arr)
    {
        int totalSubArray=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    System.out.print(arr[k]+" ");
                }
                totalSubArray++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total sub arrays are "+totalSubArray);
    }
}
