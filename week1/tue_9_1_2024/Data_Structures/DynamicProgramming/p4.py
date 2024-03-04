def lcs(s1,s2,n,m,dp):
    if n==0 or m==0:
        return 0
    if dp[n][m]!=-1:
        return dp[n][m]
    if s1[n-1]==s2[m-1]:
        dp[n][m]=1+lcs(s1,s2,n-1,m-1,dp)
    else:
        dp[n][m]=max(lcs(s1,s2,n-1,m,dp),lcs(s1,s2,n,m-1,dp))
    return dp[n][m]

s1="rishabh"
s2="shubhi"
n=len(s1) 
m=len(s2) 
dp=[[-1 for i in range(m+1)] for i in range(n+1)]
print("lcs is : ",lcs(s1,s2,n,m,dp))