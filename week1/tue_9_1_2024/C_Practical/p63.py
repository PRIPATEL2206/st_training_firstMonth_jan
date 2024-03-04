from collections import defaultdict


class Graph:

    def __init__(self):
        self.graph = defaultdict(list)
 
     
    def addEdge(self, u, v):
        self.graph[u].append(v)
    def bfsUtils(self,v):
        visited=set()
        print(v,end=" ")
        q=self.graph[v]
        visited.add(v)
        while len(q)!=0:
            if q[0] not in visited:
                print(q[0],end=" ")
                visited.add(q[0])
                q+=self.graph[q[0]]
            q=q[1:]
        

g = Graph()
g.addEdge(0, 1)
g.addEdge(0, 2)
g.addEdge(1, 2)
g.addEdge(2, 0)
g.addEdge(2, 3)
g.addEdge(3, 3)

g.bfsUtils(0)
