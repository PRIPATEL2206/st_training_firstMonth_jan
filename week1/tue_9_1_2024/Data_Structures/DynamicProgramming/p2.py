def lis_r(arr:list,n,c,p):
    if c==n:
        return 0
    take=0
    if p==-1 or arr[c]>arr[p]:
        take=1+lis_r(arr,n,c+1,c)
    notTake=0+lis_r(arr,n,c+1,p)
    return max(take,notTake)

def lis_dp(arr:list,n,c,p,dp):
    if c==n:
        return 0
    if dp[c][p+1]:
        return dp[c][p+1]
    take=0
    if p==-1 or arr[c]>arr[p]:
        take=1+lis_r(arr,n,c+1,c)
    notTake=0+lis_r(arr,n,c+1,p)
    dp[c][p+1]=max(take,notTake)
    return dp[c][p+1]

arr=list(map(int,input().split()))
n=len(arr)
dp=n*[[0]]
print("rec",lis_r(arr,n,0,-1))