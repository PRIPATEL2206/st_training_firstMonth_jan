def isSubsetSum(arr, n, target_sum):

    dp = [[False for i in range(target_sum + 1)] for j in range(n + 1)]

    for i in range(n + 1):
        dp[i][0] = True

    for i in range(1, n + 1):
        for j in range(1, target_sum + 1):
            dp[i][j] = dp[i - 1][j]
            if j >= arr[i - 1]:
                dp[i][j] = dp[i][j] or dp[i - 1][j - arr[i - 1]]

    return dp[n][target_sum]

arr = [3, 34, 4, 12, 5, 2]
target_sum = 9
n = len(arr)

if isSubsetSum(arr, n, target_sum):
    print("Subset with the given sum exists")
else:
    print("No subset with the given sum exists")