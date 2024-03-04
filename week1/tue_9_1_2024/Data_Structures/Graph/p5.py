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
        self.graph[v][u]=0

def BFS(graph:list[list],visited:set,srs:int):
    if len(visited)==len(graph):
        return
    visited.add(srs)
    edges=[ i for i,w in enumerate(graph[srs]) if w !=0 and (i not in visited)]
    for i in edges:
        BFS(graph,visited,i)
        visited.add(i)

def conectedEdges(graph:list[list],srs):
    cv=set()
    BFS(graph,cv,srs)
    return list(cv)


'''
0 - 1  2
|   |
3 - 4
'''

g=Graph(5)
g.addEdge(1,0,3)
g.addEdge(1,3,4)
g.addEdge(1,4,1)
g.addEdge(1,1,0)

visited=set()
print(conectedEdges(g.graph,0))
