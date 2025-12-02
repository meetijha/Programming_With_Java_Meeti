package ex_03_Sorting;

public class P026_Selection_Sort {
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        selectionSort(arr);
        printArr(arr);
    }

    public static void printArr(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
// Select the smallest and keep in front and so on
    public static void selectionSort(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j]<arr[minPos])
                    minPos = j;
            }

            //swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }
}
