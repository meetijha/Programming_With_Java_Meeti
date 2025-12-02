package ex_03_Sorting;

import java.util.Arrays;
import java.util.Collections;

public class P028_Java_Inbuilt_Sort {
    public static void main(String[] args) {
        int[] arr= {4,5,3,1,2};

        // TC= n (log n)
        Arrays.sort(arr);
        printArr(arr);

        // Sorting only a part of array
        int[] arr1={5,4,3,2,1};
        Arrays.sort(arr1,0,3);// arr, start index, end index
        // end index is non inclusive
        //Output - 3,4,521
        System.out.println();
        printArr(arr1);

        // Sorting an array in reverse order requires Collections
        Integer arr2[] ={4,5,3,1,2};// int has to be converted to Integer
        Arrays.sort(arr2,Collections.reverseOrder());
        printArr(arr2);// 54321

        Integer arr3[]={5,1,4,3,2};
        Arrays.sort(arr3,0,3, Collections.reverseOrder());
        printArr(arr3);//54132

    }

    public static void printArr(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }

    public static void printArr(Integer arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
