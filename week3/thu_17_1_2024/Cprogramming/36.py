# file 36.py
import random, math

def floyd_rivest_select(arr, left, right, k):
    while right > left:
        if right - left > 600:
            n = right - left + 1
            m = k - left + 1
            z = math.log(n)
            s = 0.5 * math.exp(2 * z / 3)
            sd = 0.5 * math.sqrt(z * s * (n - s) / n) * random.choice([-1, 1])
            new_left = int(max(left, k - m * s / n + sd))
            new_right = int(min(right, k + (n - m) * s / n + sd))
            floyd_rivest_select(arr, new_left, new_right, k)
        
        t = arr[k]
        i = left
        j = right

        arr[left], arr[k] = arr[k], arr[left]
        
        if arr[right] > t:
            arr[right], arr[left] = arr[left], arr[right]

        while i < j:
            arr[i], arr[j] = arr[j], arr[i]
            i += 1
            j -= 1
            while arr[i] < t:
                i += 1
            while arr[j] > t:
                j -= 1

        if arr[left] == t:
            arr[left], arr[j] = arr[j], arr[left]
        else:
            j += 1
            arr[j], arr[right] = arr[right], arr[j]

        if j <= k:
            left = j + 1
        if k <= j:
            right = j - 1

# Example Usage:
arr = [3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5]
k = 6
floyd_rivest_select(arr, 0, len(arr) - 1, k - 1)
result = arr[k - 1]
print(f"The {k}-th smallest element is: {result}")
