class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m= mat.length ;
        int n = mat[0].length ;
        int[] ans = new int[m*n];
        int index = 0 ;

        for(int sum=0 ; sum <= m+n-2 ; sum++)
        {
            if(sum%2 == 0 )
            {
                for(int i=m-1 ; i>=0 ; i--)
                {
                    for(int j=n-1 ; j>=0 ; j--)
                    {
                        if(i+j == sum)
                        {
            
                            ans[index++]= mat[i][j];
                        }

                    }
                }
            }
            else
            {
                for(int i =0 ; i<m; i++)
                {
                    for(int j=0 ; j<n ; j++)
                    {
                        if(i+j == sum)
                        {
                            ans[index++]= mat[i][j];
                        }
                    }
                }
            }


        }
        return ans ;

        

    }
}

//FIRST SUM. arr[0][0] will have sum 0 . arr[0][1] will have sum 0+1 = 1 
//indexes with same sum together 
//if sum is odd ->