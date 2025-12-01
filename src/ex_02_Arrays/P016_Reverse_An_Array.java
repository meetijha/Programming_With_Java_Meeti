package ex_02_Arrays;

public class P016_Reverse_An_Array {
    public static void main(String[] args) {
        int[] arr={4,3,2,1};
        printArray(arr);

        System.out.println("Reversing without extra array");
        reverse(arr);
        printArray(arr);

        //reversing again using simple arrray
        System.out.println("Reversing again");
        simpleReverse(arr);
        printArray(arr);
    }

    //Time complexity - O(n/2)= O(n)
    // Space complexity - O(1)
    public static void reverse(int[] arr)
    {
        int temp;
        int arrLength=arr.length;
        for(int i=0;i<arrLength/2;i++)
        {
            temp=arr[i];
            arr[i]=arr[arrLength-i-1];
            arr[arrLength-i-1]=temp;
        }
    }

    //Time complexity - O(n)
    // Space complexity - O(n)
    public static void simpleReverse(int[] arr)
    {
        int[] temp=new int[arr.length];

        for(int i=0;i< arr.length;i++)
        {
            temp[i]=arr[arr.length-i-1];

        }

        /*
        If instead of below step we write
        arr=temp; // here only arr started pointing to local reference of temp
        Original value inside arr remains same
        */

        for(int i=0;i< temp.length;i++)
        {
            arr[i]=temp[i];
        }
    }

    public static void printArray(int[] arr)
    {
        for(int i=0;i<=arr.length-1;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
