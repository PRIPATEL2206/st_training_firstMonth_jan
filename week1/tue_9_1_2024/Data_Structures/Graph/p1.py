class Graph:
    graph=[[]]
    V=0
    def __init__(self,n) -> None:
       self.V=n
       self.graph=n*[n*[0]]
    def addEdge(self,w,u,v):
        self.graph[u][v]=w
    def removeEdges(self,u,v):
        self.graph[u][v]=0


