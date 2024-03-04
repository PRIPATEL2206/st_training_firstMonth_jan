from collections import defaultdict

class Graph:
    def __init__(self, vertices):
        self.V = vertices
        self.graph = defaultdict(list)
        self.time = 0

    def add_edge(self, u, v):
        self.graph[u].append(v)
        self.graph[v].append(u)

    def _articulation_points_util(self, u, visited, parent, low, disc, ap):
        children = 0
        visited[u] = True
        disc[u] = self.time
        low[u] = self.time
        self.time += 1

        for v in self.graph[u]:
            if not visited[v]:
                children += 1
                parent[v] = u
                self._articulation_points_util(v, visited, parent, low, disc, ap)

                low[u] = min(low[u], low[v])

                if low[v] >= disc[u] and parent[u] != -1:
                    ap[u] = True

                if parent[u] == -1 and children > 1:
                    ap[u] = True

            elif v != parent[u]:
                low[u] = min(low[u], disc[v])

    def find_articulation_points(self):
        visited = [False] * self.V
        disc = [float("inf")] * self.V
        low = [float("inf")] * self.V
        parent = [-1] * self.V
        ap = [False] * self.V

        for i in range(self.V):
            if not visited[i]:
                self._articulation_points_util(i, visited, parent, low, disc, ap)

        articulation_points = [idx for idx, value in enumerate(ap) if value]
        return articulation_points

graph = Graph(5)
graph.add_edge(0, 1)
graph.add_edge(1, 2)
graph.add_edge(2, 0)
graph.add_edge(1, 3)
graph.add_edge(3, 4)

articulation_points_result = graph.find_articulation_points()

print("Articulation Points:")
print(articulation_points_result)