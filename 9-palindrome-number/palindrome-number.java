class Solution {
    public boolean isPalindrome(int x) {
        int revnum = 0;
        int dup = x; //duplicate variable to store value of x 
        while(x>0)
        {
            int lastdigit = x%10;
            
            revnum = (revnum*10)+lastdigit ;
            x = x/10;


        }
        if(revnum == dup)
        {
            return true ;
        }
        else
        {
            return false;
        }


    }
}
//121 . 121%10 = 1 . store in lastdigit  . and 121/10 = 12 .so x=12 

// revnum = (revnum *10)+lastdigit 
//0*10 + 1-> 0 + 1 ->1
//1*10 + 2 --> 10 + 2 -->12
//12*10 + 1 --> 120 + 1 -->121 is revnum
