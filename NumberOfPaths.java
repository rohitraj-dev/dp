class NumberOfPaths
{
    public int numberOfPaths(int m, int n)
    {
        int[][] dp = new int[2][n];
        for(int j=0; j<n; j++)
        {
            dp[0][j] = 1;
        }
        dp[1][0] = 1;
        for(int a=1; a<=m; a++)
        {
            if(a%2 == 1)
            {
                for(int j=1; j<n; j++)
                {
                    dp[1][j] = dp[0][j] + dp[1][j-1];
                }
            }
            else
            {
                for(int j=1; j<n; j++)
                {
                    dp[0][j] = dp[1][j] + dp[0][j-1];
                }
            }
        }
        return dp[1][n-1];
    }
    public int numberOfPaths(int m, int n)
    {
        int[][] dp = new int[m][n];
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(i==0 || j==0)
                    dp[i][j] = 1;
                else
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
    static int[][] dp;
    public int numberOfPaths(int m, int n)
    {
        dp = new int[m+1][n+1];
        return paths(m,n);
    }
    public int paths(int m, int n)
    {
        if(m==1 || n==1)
            return 1;
        if(dp[m][n] != 0)
            return dp[m][n];
        return dp[m][n] = paths(m-1, n) + paths(m, n-1);
    }
}