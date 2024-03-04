# file 100.py
def minimum_total(triangle):
    # Start from the second-to-last row and update the triangle with minimum path sums
    for i in range(len(triangle) - 2, -1, -1):
        for j in range(len(triangle[i])):
            triangle[i][j] += min(triangle[i + 1][j], triangle[i + 1][j + 1])

    # The top element of the triangle will contain the minimum path sum
    return triangle[0][0]

# Example usage:
triangle = [
    [2],
    [3, 4],
    [6, 5, 7],
    [4, 1, 8, 3]
]

result = minimum_total(triangle)
print("The minimum path sum is:", result)