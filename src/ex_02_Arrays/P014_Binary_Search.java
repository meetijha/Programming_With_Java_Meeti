package ex_02_Arrays;

public class P014_Binary_Search {
    public static void main(String[] args) {
        int[] arr={3,7,8,11,17,19,40,56,79,90};

        //Prerequisite of Binary Search: SORTED ARRAY
        int keyPos=binarySearch(arr,40);
        if(keyPos==-1){
            System.out.println("Key Not Found!");
        }
        else {
            System.out.println("Key is found at index : " + keyPos);
        }
    }

    //Time Complexity - O(logn)(Base 2)
    public static int binarySearch(int[] arr,int key)
    {
        int startPoint=0;
        int endPoint=arr.length-1;
        int mid;
        while(startPoint<=endPoint)
        {
            mid=(endPoint+startPoint)/2;
            if(arr[mid]==key)
            {
                return mid;
            }
            else {
                if(key>arr[mid]){
                    startPoint=mid+1;
                }
                else{
                    endPoint=mid-1;
                }
            }
        }
        return -1;
    }
}
