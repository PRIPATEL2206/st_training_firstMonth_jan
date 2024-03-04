class Graph:
    def __init__(self, m, n):
        self.m = m
        self.n = n
        self.graph = {i: [] for i in range(m)}

    def add_edge(self, u, v):
        if u in self.graph:
            self.graph[u].append(v)
        else:
            self.graph[u] = [v]

def hopcroft_karp(graph, m, n):
    matchR = [-1] * n
    dist = [0] * (m + n)  # Create a new list that can store values at indices m + v

    def bfs():
        queue = []
        for i in range(m):
            if dist[i] == 0:
                queue.append(i)
                dist[i] = 1
        while queue:
            u = queue.pop(0)
            for v in graph.graph[u]:
                if matchR[v] == -1:
                    dist[m + v] = dist[u] + 1
                elif dist[matchR[v]] == 0:
                    dist[matchR[v]] = dist[u] + 1
                    queue.append(matchR[v])

    def dfs(u):
        if u != -1:
            for v in graph.graph[u]:
                if dist[matchR[v]] == dist[u] + 1 and dfs(matchR[v]):
                    matchR[v] = u
                    return True
            dist[u] = 0
            return False
        return True

    matching = 0
    while True:
        bfs()
        augmenting_path = sum(dfs(i) for i in range(m))
        if augmenting_path == 0:
            break
        matching += augmenting_path

    return matching
# Example Usage:
graph = Graph(4, 4)
graph.add_edge(0, 1)
graph.add_edge(0, 2)
graph.add_edge(1, 2)
graph.add_edge(2, 0)
graph.add_edge(2, 3)
graph.add_edge(3, 3)

result = hopcroft_karp(graph, 4, 4)
print("Maximum Bipartite Matching:", result)