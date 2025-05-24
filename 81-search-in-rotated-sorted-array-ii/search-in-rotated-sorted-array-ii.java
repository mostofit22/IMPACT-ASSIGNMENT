//same as Search in Rotated Sorted Array just change int type to boolean . then instead of returning mid , return true . instead of returning -1 and false 


class Solution {
    public boolean search(int[] arr, int target) {
        int n = arr.length ;
        int start = 0;
        int end = n-1;
        while(start<= end )
        {
            int mid = (start+end)/2;
            if(arr[mid] == target) return true ;
            if(arr[start] == arr[mid] && arr[mid]==arr[end])
            {
                start++;
                end --;
                continue;
            }
                
            
        
            
            //check if left half is sorted
            if(arr[start] <= arr[mid])
            {
                //is target there in right half

                if(target<= arr[mid] && target >= arr[start])
                {
                    end = mid-1;
                }
                else
                {
                    start = mid+1;
                }
            }
            //if right half is sorted 
            else
            {
                if(target<= arr[end] && target>=arr[mid])
                {
                    start= mid+1;
                }
                else
                {
                    end = mid-1;
                }
            }
            
        }
        return false;

        
    }
   

}