from collections import defaultdict, deque

class Graph:
    def __init__(self, vertices):
        self.vertices = vertices
        self.graph = defaultdict(list)

    def add_edge(self, u, v):
        self.graph[u].append(v)

    def _dfs(self, vertex, visited, stack):
        visited[vertex] = True

        for neighbor in self.graph[vertex]:
            if not visited[neighbor]:
                self._dfs(neighbor, visited, stack)

        stack.append(vertex)

    def _transpose(self):
        transposed_graph = Graph(self.vertices)

        for vertex in self.graph:
            for neighbor in self.graph[vertex]:
                transposed_graph.add_edge(neighbor, vertex)

        return transposed_graph

    def _dfs_scc(self, vertex, visited, scc):
        visited[vertex] = True
        scc.append(vertex)

        for neighbor in self.graph[vertex]:
            if not visited[neighbor]:
                self._dfs_scc(neighbor, visited, scc)

    def find_scc(self):
        stack = deque()
        visited = [False] * self.vertices

        for vertex in range(self.vertices):
            if not visited[vertex]:
                self._dfs(vertex, visited, stack)

        transposed_graph = self._transpose()
        visited = [False] * self.vertices
        strongly_connected_components = []

        while stack:
            vertex = stack.pop()
            if not visited[vertex]:
                scc = []
                transposed_graph._dfs_scc(vertex, visited, scc)
                strongly_connected_components.append(scc)

        return strongly_connected_components

graph = Graph(8)
graph.add_edge(0, 1)
graph.add_edge(1, 2)
graph.add_edge(2, 0)
graph.add_edge(2, 3)
graph.add_edge(3, 4)
graph.add_edge(4, 5)
graph.add_edge(5, 3)
graph.add_edge(6, 5)
graph.add_edge(6, 7)
graph.add_edge(7, 6)

scc_result = graph.find_scc()

print("Strongly Connected Components:")
for component in scc_result:
    print(component)