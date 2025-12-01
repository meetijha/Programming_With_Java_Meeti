package ex_02_Arrays;

// non zero array required
// width of all bars is 1
// auxillary arrays used here- helper arrays

// Calculate water level trapped between bars

// TC= O(n)
public class P022_Trapping_Rainwater {

    public static void main(String[] args) {
        int[] height={4,2,0,6,3,2,5};
        System.out.println("Trapped Water = "+tappedRainWater(height));
    }

    //Trapperd water= waterLevel - barHeight
    // waterLevel= min(maxLeftBoundar - maxRightBoundary)
    // Left max boundary - calculate from left
    //Right max boundary - calculate from right
    public static int tappedRainWater(int[] height)
    {   int n=height.length;
        // calculate left max boundary -array
        int leftMax[]= new int[n];
        leftMax[0]= height[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
            System.out.println(leftMax[i]);
        }
        System.out.println();
        // calculate rigjht max boundary -array
        int rightMax[] = new int[n];
        rightMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--)
        {
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
            System.out.println(rightMax[i]);
        }
        System.out.println();
        //loop
        int trappedWater=0;
        for(int i=0; i<n;i++)
        {
            //waterLevel= min(leftmax bound, rightmax bound)
            int waterLevel= Math.min(leftMax[i],rightMax[i]);
            System.out.println(waterLevel);
            // trapped water = waterLevel- height
            trappedWater+=waterLevel-height[i];
            //System.out.println(trappedWater);
        }

        return trappedWater;
    }
}
