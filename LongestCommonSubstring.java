class LongestCommonSubstring
{
    public int longestCommonSubstring(String a, String b)
    {
        int m = a.length(), n = b.length();
        int[][] dp = new int[m+1][n+1];
        int maxLen = 0;
        for(int i=1; i<=m; i++)
        {
            for(int j=1; j<=n; j++)
            {
                if(a.charAt(i-1) == b.charAt(j-1))
                    dp[i][j] = 1 + dp[i-1][j-1];
                else
                    dp[i][j] = 0;
                maxLen = Math.max(maxLen, dp[i][j]);
            }
        }
        return maxLen;
    }
}