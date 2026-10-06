class FriendsPairing
{
    public long countFriendsPairing(int n)
    {
        long[] dp = new long[n+1];
        return friends(n, dp);
    }
    public long friends(int n, long[] dp)
    {
        if(n<=2)
            return n;
        if(dp[n] != 0)
            return dp[n];
        return dp[n] = friends(n-1, dp) + (n-1)*friends(n-2, dp);
    }
}