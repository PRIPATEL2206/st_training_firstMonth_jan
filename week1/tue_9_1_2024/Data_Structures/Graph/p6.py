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
    
    def isCycleUtil(self,node:int,visited:list,recr:list):
        visited[node]=True
        recr[node]=True
        for neig in self.graph[node]:
            if not visited[neig]:
                if self.isCycleUtil(neig,visited,recr):
                    return True
            elif recr[neig]:
                return True
        
        recr[node]=False
        return False
        

    def isCycle(self):
        visited=self.V*[False]
        recr=self.V*[False]
        for i in range(self.V):
            if not visited[i]:
                if self.isCycleUtil(i,visited,recr):
                    return True
        return False
    

'''
0 - 1  2
|   |
3 - 4
'''

g=Graph(5)
g.addEdge(0,3)
g.addEdge(3,4)
g.addEdge(4,1)
g.addEdge(0,1)
if g.isCycle():
    print("their is a cycle in graph.")
else:
    print("their is no a cycle in graph.")