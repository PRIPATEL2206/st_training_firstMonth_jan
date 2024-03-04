from collections import defaultdict, deque

class Graph:
    def __init__(self, vertices):
        self.graph = defaultdict(list)
        self.V = vertices

    def add_edge(self, u, v):
        self.graph[u].append(v)

    def dfs(self, vertex, visited, stack):
        visited[vertex] = True
        for neighbor in self.graph[vertex]:
            if not visited[neighbor]:
                self.dfs(neighbor, visited, stack)
        stack.append(vertex)

    def transpose(self):
        transposed_graph = Graph(self.V)
        for vertex in self.graph:
            for neighbor in self.graph[vertex]:
                transposed_graph.add_edge(neighbor, vertex)
        return transposed_graph

    def dfs_scc(self, vertex, visited, scc):
        visited[vertex] = True
        scc.append(vertex)
        for neighbor in self.graph[vertex]:
            if not visited[neighbor]:
                self.dfs_scc(neighbor, visited, scc)

    def find_scc(self):
        stack = deque()
        visited = [False] * self.V

        for vertex in range(self.V):
            if not visited[vertex]:
                self.dfs(vertex, visited, stack)

        transposed_graph = self.transpose()

        visited = [False] * self.V
        strongly_connected_components = []

        while stack:
            vertex = stack.pop()
            if not visited[vertex]:
                scc = []
                transposed_graph.dfs_scc(vertex, visited, scc)
                strongly_connected_components.append(scc)

        return strongly_connected_components

g = Graph(5)
g.add_edge(0, 1)
g.add_edge(1, 2)
g.add_edge(2, 0)
g.add_edge(1, 3)
g.add_edge(3, 4)

scc_result = g.find_scc()
print("Strongly Connected Components:")
for component in scc_result:
    print(component)
