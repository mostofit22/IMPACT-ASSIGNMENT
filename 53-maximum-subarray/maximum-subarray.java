class Solution {
    public int maxSubArray(int[] nums) {
    int n = nums.length ;
    int currsum = nums[0];
    int maxsum = nums[0];
    for(int i=1 ; i<n ; i++)
    {
        if(currsum >= 0 )
        {
            currsum += nums[i];

        }
        else
        {
            currsum = nums[i];
        }
        if(currsum > maxsum)
        {
            maxsum = currsum ;
        }
    }
        return maxsum ;
    }
}

