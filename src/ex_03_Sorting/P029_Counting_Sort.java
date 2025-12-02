package ex_03_Sorting;

public class P029_Counting_Sort {
    public static void main(String[] args) {
        int[] arr={1,4,1,3,2,4,3,7};
        countingSort(arr);
        printArr(arr);
    }

    // Useful when numbers are more and range is less
    // TC O(n +range)
    public static void countingSort(int[] arr)
    {
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            largest=Math.max(largest,arr[i]);
        }
        int count[]=new int[largest+1];
        for(int i=0;i<arr.length;i++){
           count[arr[i]]++;
        }

        //sorting
        int j=0;
        for(int i=0; i<count.length; i++)
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
    }
    public static void printArr(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }


}
