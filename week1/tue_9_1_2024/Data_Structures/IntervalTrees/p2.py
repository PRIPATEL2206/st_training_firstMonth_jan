
def find_overlapping_intervals(intervals):
    intervals.sort(key=lambda x: x[0])
    overlapping_intervals = []

    for i in range(1, len(intervals)):
        if intervals[i][0] <= intervals[i - 1][1]:
            overlapping_intervals.append((max(intervals[i - 1][0], intervals[i][0]), min(intervals[i - 1][1], intervals[i][1])))

    return overlapping_intervals


intervals = [(1, 3), (2, 6), (5, 8), (7, 10)]
result = find_overlapping_intervals(intervals)
print("Overlapping Intervals:", result)