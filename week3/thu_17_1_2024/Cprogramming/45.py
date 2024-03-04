# file 45.py
def word_break(s, word_dict):
    n = len(s)
    dp = [False] * (n + 1)
    dp[0] = True

    for i in range(1, n + 1):
        for j in range(i):
            if dp[j] and s[j:i] in word_dict:
                dp[i] = True
                break

    return dp[n]

# Example Usage:
s = "leetcode"
word_dict = ["leet", "code"]
result = word_break(s, word_dict)
print(f"Can be segmented: {result}")
