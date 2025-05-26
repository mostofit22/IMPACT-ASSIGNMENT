class Solution {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // Minimum is in the right half
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            }
            // Minimum is in the left half or at mid
            else {
                right = mid;
            }
        }

        // Left will point to the minimum element
        return nums[left];
    }
}
