# file 46.py
def subset_sum(nums, target):
    def backtrack(start, target):
        if target == 0:
            return True
        for i in range(start, len(nums)):
            if nums[i] <= target and backtrack(i + 1, target - nums[i]):
                return True
        return False

    return backtrack(0, target)

# Example Usage:
nums = [3, 34, 4, 12, 5, 2]
target = 9
result = subset_sum(nums, target)
print(f"Subset with sum {target} exists: {result}")
