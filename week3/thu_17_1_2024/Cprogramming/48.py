# file 48.py
def longest_common_substring(str1, str2):
    m, n = len(str1), len(str2)
    dp = [[0] * (n + 1) for _ in range(m + 1)]
    max_len, end_index = 0, 0

    for i in range(1, m + 1):
        for j in range(1, n + 1):
            if str1[i - 1] == str2[j - 1]:
                dp[i][j] = dp[i - 1][j - 1] + 1
                if dp[i][j] > max_len:
                    max_len = dp[i][j]
                    end_index = i - 1
            else:
                dp[i][j] = 0

    return str1[end_index - max_len + 1:end_index + 1]

# Example Usage:
str1 = "ABABC"
str2 = "BABCAC"
result = longest_common_substring(str1, str2)
print(f"Longest Common Substring: {result}")
