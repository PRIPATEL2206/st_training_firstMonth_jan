from collections import defaultdict, deque

class Graph:
    def __init__(self):
        self.graph = defaultdict(list)

    def add_edge(self, u, v):
        self.graph[u].append(v)
        self.graph[v].append(u)

    def is_bipartite(self):
        color = {}  
        visited = set()

        for node in self.graph:
            if node not in visited:
                queue = deque([(node, 0)])  
                visited.add(node)
                color[node] = 0

                while queue:
                    current, current_color = queue.popleft()

                    for neighbor in self.graph[current]:
                        if neighbor not in visited:
                            visited.add(neighbor)
                            color[neighbor] = 1 - current_color
                            queue.append((neighbor, color[neighbor]))
                        elif color[neighbor] == current_color:
                            return False  

        return True 

graph = Graph()
graph.add_edge(0, 1)
graph.add_edge(0, 2)
graph.add_edge(1, 3)
graph.add_edge(2, 4)

if graph.is_bipartite():
    print("Graph is bipartite")
else:
    print("Graph is not bipartite")