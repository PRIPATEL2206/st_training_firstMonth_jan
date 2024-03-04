# file 50.py

from collections import deque

def bfs_2d_grid(grid, start):
    directions = [(0, 1), (1, 0), (0, -1), (-1, 0)]
    m, n = len(grid), len(grid[0])
    visited = [[False] * n for _ in range(m)]

    queue = deque([start])
    visited[start[0]][start[1]] = True

    while queue:
        curr = queue.popleft()
        print(curr)  # Process the current node

        for d in directions:
            next_row, next_col = curr[0] + d[0], curr[1] + d[1]
            if 0 <= next_row < m and 0 <= next_col < n and not visited[next_row][next_col]:
                queue.append((next_row, next_col))
                visited[next_row][next_col] = True

# Example Usage:
grid = [
    [1, 0, 1, 1, 0],
    [1, 1, 0, 0, 1],
    [0, 1, 1, 1, 0],
    [0, 0, 0, 1, 1]
]
start_node = (0, 0)
bfs_2d_grid(grid, start_node)
