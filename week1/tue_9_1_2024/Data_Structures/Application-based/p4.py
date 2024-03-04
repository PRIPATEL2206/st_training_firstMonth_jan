from collections import deque

def shortest_path_maze(maze):
    rows, cols = len(maze), len(maze[0])

    # Define directions: up, down, left, right
    directions = [(-1, 0), (1, 0), (0, -1), (0, 1)]

    def is_valid(x, y):
        return 0 <= x < rows and 0 <= y < cols and maze[x][y] == 0

    def get_neighbors(x, y):
        neighbors = []
        for dx, dy in directions:
            new_x, new_y = x + dx, y + dy
            if is_valid(new_x, new_y):
                neighbors.append((new_x, new_y))
        return neighbors

    start = (0, 0)
    end = (rows - 1, cols - 1)

    queue = deque([(start, 0)])  # Queue stores current position and steps taken
    visited = set()

    while queue:
        current, steps = queue.popleft()
        x, y = current

        if current == end:
            return steps  # Found the shortest path

        if current in visited:
            continue

        visited.add(current)

        for neighbor in get_neighbors(x, y):
            queue.append((neighbor, steps + 1))

    return -1  

maze = [
    [0, 1, 0, 0, 0],
    [0, 1, 0, 1, 0],
    [0, 0, 0, 1, 0],
    [1, 1, 1, 1, 0],
    [0, 0, 0, 0, 0]
]

result = shortest_path_maze(maze)

if result != -1:
    print(f"The shortest path in the maze takes {result} steps.")
else:
    print("No path found in the maze.")
