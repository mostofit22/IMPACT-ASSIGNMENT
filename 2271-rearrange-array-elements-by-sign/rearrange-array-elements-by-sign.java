class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int pos = 0; // positive index --> 0 
        int neg = 1; // neg index set to 1

        int[] result_array = new int[n]; //make new array for results
        for(int i =0 ; i<n ; i++)
        {
            if(nums[i]>0)
            {
                result_array[pos] = nums[i] ;
                pos += 2 ;// so that alternative order is conserved 
            }
            else
            {
                result_array[neg] = nums[i] ;
                neg += 2 ; 
            }
        }
        return result_array;
}
}