class Graph:
    graph=[[]]
    V=0
    def __init__(self,n) -> None:
       self.V=n
       self.graph=[[] for i in range(n)]
    def addEdge(self,u,v):
        self.graph[u].append(v)
    def removeEdges(self,u,v):
        self.graph[u].remove(v)
    def isBipartite(self,node:int,visited:list,color:list):
        for u in self.graph[node]:
            if not visited[u]:
                visited[u]=True
                color[u]=not color[node]
                if not self.isBipartite(u,visited,color):
                    return False
            elif color[u]==color[node]:
                return False
        return True


'''
0 - 1 
|   |
3 - 4
'''

g=Graph(5)
g.addEdge(0,3)
g.addEdge(3,4)
g.addEdge(4,1)
g.addEdge(0,1)

visited=g.V*[False]
color=g.V*[False]
color[0]=True
visited[0]=True

if g.isBipartite(0,visited,color):
    print("graph is Bipartite.")
else:
    print("graph is not Bipartite.")