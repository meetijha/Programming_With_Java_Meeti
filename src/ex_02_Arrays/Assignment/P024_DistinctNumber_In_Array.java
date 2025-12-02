package ex_02_Arrays.Assignment;

import java.util.Arrays;
import java.util.HashSet;

// Return true if any number appears twice in an array else return false
public class P024_DistinctNumber_In_Array {

    public static void main(String[] args) {
        int[] arr1={1,2,3,1};
        int[] arr2={1,2,3,4};
        int[] arr3={1, 1, 1, 3, 3, 4, 3, 2, 4, 2};

        System.out.println(checkDuplicates(arr1));
        System.out.println(checkDuplicates(arr2));
        System.out.println(checkDuplicates(arr3));

        System.out.println(checkDuplicatesUsingHash(arr1));
        System.out.println(checkDuplicatesUsingHash(arr2));
        System.out.println(checkDuplicatesUsingHash(arr3));

    }

    // Approach 1- brute force
    /*
    Time Complexity: O(N2), As we are using nested loop over the given array, where N is the number of elements in the given array.
    Auxiliary Space: O(1), As we are not using any extra space.*/
    public static boolean checkDuplicates(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            int count=0;
            for(int j=0;j<arr.length;j++)
            {
                if (arr[i]==arr[j])
                {
                    count++;
                }
                if(count==2) {
                    return false;
                }
            }
        }
        return true;
    }

    //Approach 2 - using HashSet
//    Time Complexity: O(n), As we are traversing over the array once.
//    Auxiliary space: O(n), As we are using unordered set which takes
//    O(n) space in worst case, where n is the size of the array.
    public static boolean checkDuplicatesUsingHash(int[] arr)
    {
        HashSet<Integer> hs= new HashSet<Integer>();
        for(int i=0;i<arr.length;i++)
        {
            if(hs.contains(arr[i])) {
            return false;
        }
            else hs.add(arr[i]);

        }
        return true;
    }

    // Approach 3
//    Time Complexity: O(n * logn), As we are using sorting function which takes nlogn time.
//    Auxiliary space: O(1), As we are not using extra space.

    public static boolean checkDuplictaesSortedArray(int arr[])
    {
        Arrays.sort(arr);
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]==arr[i-1])
            {
                return false;
            }
        }
        return true;
    }
}
