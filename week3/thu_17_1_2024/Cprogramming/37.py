# file 37.py
def rod_cutting(lengths, prices, n):
    dp = [0] * (n + 1)

    for i in range(1, n + 1):
        max_val = float('-inf')
        for j in range(i):
            max_val = max(max_val, prices[j] + dp[i - j - 1])
        dp[i] = max_val

    return dp[n]

# Example Usage:
lengths = [1, 2, 3, 4, 5, 6, 7, 8]
prices = [1, 5, 8, 9, 10, 17, 17, 20]
rod_length = 4
max_value = rod_cutting(lengths, prices, rod_length)
print(f"The maximum obtainable value is: {max_value}")
