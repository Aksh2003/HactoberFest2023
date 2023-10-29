class Solution {
    public int climbStairs(int n) {
        
        if(n<=3)
            return n;
     
  
        int b=2;
        int c= 3;
        int d=0;
        for(int i=4;i<=n;i++)
        {
            d=b+c;
            b=c;
            c=d;
            
        }
        return d;
        
    }
}
