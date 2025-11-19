package ex_02_Arrays;

public class P013_Linear_Search {
    public static void main(String[] args) {
        int[] arr={1,6,28,16,34};
        int keyPos=linearSearch(arr,6);
        if(keyPos==-1){
            System.out.println("Key not found!");
        }
        else {
            System.out.println("Found key at position " +(keyPos+1));// 0 index array so added 1
        }

    }

    //Time Complexity - O(n)
    public static int linearSearch(int[] arr, int key)
    {
        for(int i=0;i<=arr.length;i++)
        {
            if(arr[i]==key)
            {
                return i;
            }
        }
        return -1;
    }
}
