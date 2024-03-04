# file 49.py
class Graph:
    def __init__(self, vertices):
        self.vertices = vertices
        self.edges = []

    def add_edge(self, src, dest, weight):
        self.edges.append([src, dest, weight])

def boruvka_mst(graph):
    parent = [-1] * graph.vertices
    cheapest = [-1] * graph.vertices

    while True:
        for i in range(len(graph.edges)):
            src, dest, weight = graph.edges[i]

            set1 = find(parent, src)
            set2 = find(parent, dest)

            if set1 != set2:
                if cheapest[set1] == -1 or cheapest[set1][2] > weight:
                    cheapest[set1] = [src, dest, weight]
                if cheapest[set2] == -1 or cheapest[set2][2] > weight:
                    cheapest[set2] = [src, dest, weight]

        num_trees = 0
        for i in range(graph.vertices):
            if parent[i] == -1:
                num_trees += 1

        if num_trees == 1:
            break

        for i in range(graph.vertices):
            if cheapest[i] != -1:
                set1 = find(parent, cheapest[i][0])
                set2 = find(parent, cheapest[i][1])

                if set1 != set2:
                    union(parent, set1, set2)
                    print(f"Edge {cheapest[i][0]} - {cheapest[i][1]} with weight {cheapest[i][2]} included in MST")

        for i in range(graph.vertices):
            cheapest[i] = -1

def find(parent, vertex):
    if parent[vertex] == -1:
        return vertex
    return find(parent, parent[vertex])

def union(parent, x, y):
    x_set = find(parent, x)
    y_set = find(parent, y)
    parent[x_set] = y_set

# Example Usage:
graph = Graph(4)
graph.add_edge(0, 1, 10)
graph.add_edge(0, 2, 6)
graph.add_edge(0, 3, 5)
graph.add_edge(1, 3, 15)
graph.add_edge(2, 3, 4)

boruvka_mst(graph)