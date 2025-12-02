package ex_03_Sorting;

public class P025_BubbleSort {

    public static void main(String[] args) {
        int[] arr= {5,4,1,3,2};
        bubbleSort(arr);
        printArr(arr);
    }

    public static void printArr(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }

    // Keep swapping till the max element is at last and iterate further for other elements
    // TC - O(n^2)
    public static void bubbleSort(int[] arr)
    {
        int n=arr.length;
        for(int turns=0;turns<n-1;turns++)// for n=5 -> 0,1,2,3 not 4
        {
            for(int j=0;j<n-1-turns;j++)// n=5 --> 0123, 012, 01, 0
            {
               if(arr[j]>arr[j+1])
               {
                   int temp= arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
               }
            }
        }
    }
}
