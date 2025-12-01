package ex_02_Arrays;

public class P021_Kadanes_Algorithm {

    public static void main(String[] args) {


    int arr[] ={-2,-3,4,-1,-2,1,5,-3};
    kadanes_MaxSubArraySum(arr);

    }

// Below logic is valid if atleast one number is positve in array
// if all numbers are negative this program will print 0
// so in that case we have to write extra special case code
    public static void kadanes_MaxSubArraySum(int[] arr)
    {
        int ms=Integer.MIN_VALUE;
        int cs=0;

        for(int i=0;i<arr.length;i++)
        {
           cs=cs+arr[i];
           if(cs<0)
               cs=0;
//           if(cs>ms)
//               ms=cs;
           ms=Math.max(cs,ms);
        }
        System.out.println("Max subarray sum is : "+ms);
    }
}


