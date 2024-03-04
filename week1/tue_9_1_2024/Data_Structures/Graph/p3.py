class Graph:
    graph=[[]]
    V=0
    def __init__(self,n) -> None:
       self.V=n
       self.graph=[n*[0] for i in range(n)]
    def addEdge(self,w,u,v):
        self.graph[u][v]=w
        self.graph[v][u]=w
    def removeEdges(self,u,v):
        self.graph[u][v]=0

def BFS(graph:list[list],visited:set,srs:int):
    if len(visited)==len(graph):
        return
    visited.add(srs)
    print(srs," -> ",end="")
    edges=[ i for i,w in enumerate(graph[srs]) if w !=0 and (i not in visited)]
    for i in edges:
        BFS(graph,visited,i)
        visited.add(i)


'''
0 - 1 - 2
|     /
3 - 4
'''

g=Graph(5)
g.addEdge(1,0,3)
g.addEdge(1,3,4)
g.addEdge(1,4,2)
g.addEdge(1,1,1)
g.addEdge(1,1,0)

visited=set()
BFS(g.graph,visited,0)
