# file 97.py
import heapq

def kthSmallest(matrix, k):
    # Initialize a min-heap with the first element from each row along with their row and column indices
    heap = [(matrix[i][0], i, 0) for i in range(len(matrix))]
    heapq.heapify(heap)

    # Perform k-1 pop operations to get the kth smallest element
    for _ in range(k - 1):
        value, row, col = heapq.heappop(heap)
        # If there are more elements in the same row, add the next element to the heap
        if col + 1 < len(matrix[0]):
            heapq.heappush(heap, (matrix[row][col + 1], row, col + 1))

    # The top of the heap now contains the kth smallest element
    return heap[0][0]

# Example usage:
matrix = [
    [1,  5,  9],
    [10, 11, 13],
    [12, 13, 15]
]

k = 8
result = kthSmallest(matrix, k)
print(f"The {k}th smallest element is: {result}")
