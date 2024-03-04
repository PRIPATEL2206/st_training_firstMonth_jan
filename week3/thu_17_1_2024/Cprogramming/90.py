# file 90.py
def minTaps(n, ranges):
    taps = [(i - r, i + r) for i, r in enumerate(ranges)]
    taps.sort()

    min_taps, max_reachable, i, start = 0, 0, 0, 0

    while i < n:
        while i < n and taps[i][0] <= start:
            max_reachable = max(max_reachable, taps[i][1])
            i += 1

        if i < n and taps[i][0] > start:
            if taps[i][0] > max_reachable:
                return -1  # Cannot reach the next tap
            start = max_reachable
            min_taps += 1

    return min_taps if max_reachable >= n else -1

# Example usage:
n = 7
ranges = [1, 2, 1, 0, 2, 1, 0, 1]
result = minTaps(n, ranges)
print("Minimum Number of Taps:", result)
