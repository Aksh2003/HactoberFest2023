class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
        int onestep = cost[1];
        int twostep = cost[0];
        int n = cost.length;
        int cur=0;
        for(int i=2;i<n;i++)
        {
            cur= Math.min(onestep,twostep)+cost[i];
            twostep = onestep;
            onestep = cur;
        }
        return Math.min(onestep,twostep);
    }
}
