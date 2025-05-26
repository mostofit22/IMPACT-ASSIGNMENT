class Solution {
    public int findMin(int[] arr) {
        int n = arr.length ;
        int start = 0;
        int end = n - 1;
        int ans = Integer.MAX_VALUE ;
        


        while (start <= end) {
            int mid = (start + end)/ 2;

            // if left half is sorted
            if (arr[start] <= arr[mid]) {
                ans = Math.min(ans, arr[start]);
                start = mid + 1; 
            }
            // 
            else {
                ans = Math.min(ans , arr[mid]);
                end = mid-1;
            }
        }
        return ans ;
    }
}





/*
class Solution {
    public int findMin(int[] arr) {
        int n = arr.length ;
        int start = 0;
        int end = n - 1;
        


        while (start <= end) {
            int mid = (start + end)/ 2;

            // Minimum is in the right half 
            if (arr[mid] > arr[end]) {
                start = mid + 1; //
            }
            // min  is in the left half or at mid?
            else {
                end = mid;
            }
        }
        return arr[start];
    }
}
*/
//start =0 end =2 
//4+6/2 = 10/2 5 so mid is ele 1 
// mid > end?? 1>2 ? no. end = mid . 