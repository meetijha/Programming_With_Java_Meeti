package ex_03_Sorting;

public class P027_Insertion_Sort {
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        insertionSort(arr);
        printArr(arr);
    }

    public static void printArr(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }

    //TC - O(n^2)
    // Keep inserting in the sorted array - like in cards arrangement
    public static void insertionSort(int[] arr)
    {
        for(int i=1;i<arr.length;i++)
        {

            int curr= arr[i];
            int prev=i-1;

            // finding out correct pos to insert
            while(prev>=0 && arr[prev]>curr)
            {
                arr[prev+1]=arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1]=curr;
        }
    }
}
