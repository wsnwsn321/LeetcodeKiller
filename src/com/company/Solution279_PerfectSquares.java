package src.com.company;

public class Solution279_PerfectSquares {
    public static void main(String[] args) {

    }
    public int numSquares(int n) {
        int[] dp = new int[n];
        dp[0]=0;
        dp[1] =1;
        for(int i=2;i<n;++i){
            int j=1;
            dp[i] = dp[i-1]+1;
            while (i>j*j){
                dp[i] = Math.min(dp[i-j]+1,dp[i]);
                j++;
            }
        }
        return dp[n];
    }

}
