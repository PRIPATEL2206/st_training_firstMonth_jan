def Kruskal(graph:list[list]):
    V=len(graph)
    alledges:list[dict[str,int]]=[]

    # get all edges
    for i in range(V):
        for j in range(V):
            if graph[i][j]>0:
                alledges.append({
                    "u":i,
                    "v":j,
                    "w":graph[i][j]
                })
    # sort edges
    alledges.sort(key=lambda e:e["w"])

    dis=0
    visited=[False]*V
    visited[alledges[0]["u"]]=True
    for i in alledges:
        # check for loop
        if not visited[i["v"]]:
            dis+=i["w"]
            visited[i["v"]]=True
    return dis


g2=[[0, 2, 0, 6, 0],
    [2, 0, 3, 8, 5],
    [0, 3, 0, 0, 7],
    [6, 8, 0, 0, 9],
    [0, 5, 7, 9, 0]
    ]

print(Kruskal(g2))
   