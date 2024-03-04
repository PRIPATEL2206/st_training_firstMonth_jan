class HopcroftKarp:
    def __init__(self, graph):
        self.graph = graph
        self.matching = {}
        self.distances = {}
        self.nil = None

    def bfs(self):
        queue = []
        for u in self.graph[0]:
            if self.matching[u] == self.nil:
                self.distances[u] = 0
                queue.append(u)
            else:
                self.distances[u] = float('inf')

        self.distances[self.nil] = float('inf')

        while queue:
            u = queue.pop(0)
            if self.distances[u] < self.distances[self.nil]:
                for v in self.graph[u]:
                    if self.distances[self.matching[v]] == float('inf'):
                        self.distances[self.matching[v]] = self.distances[u] + 1
                        queue.append(self.matching[v])

        return self.distances[self.nil] != float('inf')

    def dfs(self, u):
        if u != self.nil:
            for v in self.graph[u]:
                if self.distances[self.matching[v]] == self.distances[u] + 1 and self.dfs(self.matching[v]):
                    self.matching[v] = u
                    self.matching[u] = v
                    return True
            self.distances[u] = float('inf')
            return False
        return True

    def maximum_matching(self):
        self.nil = None
        for u in self.graph[0]:
            self.matching[u] = self.nil
        for v in self.graph[1]:
            self.matching[v] = self.nil

        matching_size = 0
        while self.bfs():
            for u in self.graph[0]:
                if self.matching[u] == self.nil and self.dfs(u):
                    matching_size += 1

        return matching_size, self.matching

graph = {
    0: [1, 2, 3],
    1: [0],
    2: [0],
    3: [0]
}

hk_algorithm = HopcroftKarp(graph)
matching_size, matching_edges = hk_algorithm.maximum_matching()

print("Maximum Bipartite Matching Size:", matching_size)
print("Maximum Bipartite Matching Edges:", [(u, v) for u, v in matching_edges.items() if v is not None])