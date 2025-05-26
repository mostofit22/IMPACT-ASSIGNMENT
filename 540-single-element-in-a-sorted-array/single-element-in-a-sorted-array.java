//even odd ..............odd even
class Solution {
    public int singleNonDuplicate(int[] arr) {
        int start =1 ;
        int n = arr.length;
        if(n==1) return arr[0];
        int end = n-2;

        if(arr[0] != arr[1]) return arr[0];
        if(arr[n-1] != arr[n-2]) return arr[n-1];

        while(start<=end)
        {
            int mid = (start+end)/2;

            if(arr[mid-1] != arr[mid] && arr[mid] != arr[mid+1] )
            {
                return arr[mid] ;
            }
            if(mid%2 == 0)
            {
                if(arr[mid-1] == arr[mid] )
                {
                    end = mid-1;

                }
                else
                {
                    start = mid+1;
                }
            }
            else
            {
                if(arr[mid-1] == arr[mid])
                {
                    start = mid+1;
                }
                else
                {
                    end = mid-1;
                }
            }
            
        }
        return -1;
    }
}