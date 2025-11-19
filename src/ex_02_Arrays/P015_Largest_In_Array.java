package ex_02_Arrays;

public class P015_Largest_In_Array {

    public static void main(String[] args) {
        int[] arr= {2,8,5,10,12,13,11,35};
        int largest= getLargestInArray(arr);
        System.out.println("Largest in array is "+largest);
    }

    public static int getLargestInArray(int[] arr)
    {
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;
    }
}
