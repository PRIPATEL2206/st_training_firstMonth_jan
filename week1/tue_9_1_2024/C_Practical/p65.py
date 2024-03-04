
def primes(graph:list[list],sour:int):
    dis=0
    n=1
    V=len(graph)
    # u,v,w
    arr=[ {
        "u":0,
        "v":0,
        "w":0,
    }]
    visited=[False]*V
    while len(arr)>0:
        # get minimum
        mi=min(arr,key=lambda e:e["w"])
        arr.remove(mi)
        
        if visited[mi["v"]]:
            continue
        # IF IT IS NOT VISITED THAN ADD
        dis+=mi["w"]
        visited[mi["v"]]=True

        # add all connected adges
        for i,ele in enumerate(graph[mi["v"]]):
            if ele>0 and not visited[i]:
                obj={
                    "u":mi["v"],
                    "v":i,
                    "w":ele
                }
                arr.append(obj)
    return dis



graph = [[0, 4, 0, 0, 0, 0, 0, 8, 0],
           [4, 0, 8, 0, 0, 0, 0, 11, 0],
           [0, 8, 0, 7, 0, 4, 0, 0, 2],
           [0, 0, 7, 0, 9, 14, 0, 0, 0],
           [0, 0, 0, 9, 0, 10, 0, 0, 0],
           [0, 0, 4, 14, 10, 0, 2, 0, 0],
           [0, 0, 0, 0, 0, 2, 0, 1, 6],
           [8, 11, 0, 0, 0, 0, 1, 0, 7],
           [0, 0, 2, 0, 0, 0, 6, 7, 0]
           ]
g2=[[0, 2, 0, 6, 0],
    [2, 0, 3, 8, 5],
    [0, 3, 0, 0, 7],
    [6, 8, 0, 0, 9],
    [0, 5, 7, 9, 0]]
print(primes(graph,0))
   