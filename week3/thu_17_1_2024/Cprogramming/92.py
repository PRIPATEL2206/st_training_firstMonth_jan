import heapq

def maxPerformance(n, speed, efficiency, k):
    # Combine speed and efficiency into a list of tuples
    engineers = list(zip(efficiency, speed))
    engineers.sort(reverse=True)  # Sort in descending order of efficiency

    min_heap = []  # Min heap to keep track of the fastest (k-1) engineers
    speed_sum, max_performance = 0, 0

    for eff, spd in engineers:
        heapq.heappush(min_heap, spd)
        speed_sum += spd

        if len(min_heap) > k - 1:
            speed_sum -= heapq.heappop(min_heap)

        max_performance = max(max_performance, speed_sum * eff)

    return max_performance % (10**9 + 7)

# Example usage:
n = 6
speed = [2, 10, 3, 1, 5, 8]
efficiency = [5, 4, 3, 9, 7, 2]
k = 3
result = maxPerformance(n, speed, efficiency, k)
print("Maximum Performance of a Team:", result)
