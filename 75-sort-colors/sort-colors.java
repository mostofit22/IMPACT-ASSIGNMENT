class Solution {
    public void sortColors(int[] nums) {
        int red = 0; //counts red 
        int white = 0;
        int blue = 0;
        int n = nums.length ;
        for(int i=0; i<n ; i++)
        {
            if(nums[i]==0)
            {
                
                red++; //lets say we got 2 reds. i.e red =2


            }
            else if(nums[i]==1)
            {
                white++; //white = 2 eg
            }
            else
            {
                blue++; // blue = 2 lets say

            }

        }
        
        for(int i=0; i<red; i++)
        {
            nums[i] = 0;
        }
        for(int i=red ; i< red+white ; i++)
        {
            nums[i]=1;
        }
        for(int i= red+white; i<n ; i++)
        {
            nums[i]=2;
        }

    }
}