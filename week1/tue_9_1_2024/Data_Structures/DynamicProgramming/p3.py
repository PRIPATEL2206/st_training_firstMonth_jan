def coinChange(coin,n,v,dp):
    if v==0:
        return 1
    if v<0:
        return 0
    if n<=0:
        return 0
    if dp[n][v]!=-1:
        return dp[n][v]
    dp[n][v]=coinChange(coin,n,v-coin[n-1],dp)+coinChange(coin,n-1,v,dp)
    # total types we can make change 
    return dp[n][v]

coin=[1,2,3]
v=6
n=len(coin)
dp=[ [-1 for i in range(v+1)]for i in range(n+1)]
print("posible ways are : ",coinChange(coin,n,v,dp))