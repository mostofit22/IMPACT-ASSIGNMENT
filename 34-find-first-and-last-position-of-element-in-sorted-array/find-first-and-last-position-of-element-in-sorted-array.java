

public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        
        int leftIndex = findBound(nums, target, true);
        if (leftIndex == -1) {
            return result; // target not found
        }
        
        int rightIndex = findBound(nums, target, false);
        
        result[0] = leftIndex;
        result[1] = rightIndex;
        return result;
    }
    
    // Helper function to find the left or right bound of the target
    private int findBound(int[] nums, int target, boolean isLeft) {
        int left = 0;
        int right = nums.length - 1;
        int bound = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] == target) {
                bound = mid;
                if (isLeft) {
                    // go left to find the first occurrence
                    right = mid - 1;
                } else {
                    // go right to find the last occurrence
                    left = mid + 1;
                }
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return bound;
    }
}
