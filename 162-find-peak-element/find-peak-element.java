//use binary search O(log n)
//this problem has neither rotated sorted array nor sorted array
//it is unsorted array
//A peak element is an element that is strictly greater than its neighbors.


class Solution {
    public int findPeakElement(int[] arr) {
        int n = arr.length ;
        if(n==1) return 0;
        if(arr[0]> arr[1]) return 0 ;
        if(arr[n-1] > arr[n-2]) return n-1;

        int start = 1;
        int end = n-2;

        while(start<= end)
        {
            int mid = (start+end)/2;
            if(arr[mid-1] < arr[mid] && arr[mid+1] < arr[mid])
            {
                return mid ;

            }
            else
            {
                if(arr[mid] > arr[mid-1])
                {
                    start = mid+1;
                }
                else //i.e arr[mid] < arr[mid-1]
                {
                    end = mid-1;
                }
            }
        }
        return -1;
        
    }
}