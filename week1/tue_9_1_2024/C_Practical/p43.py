def tranMat(m1:list):
    m=len(m1)
    n=len(m1[0])
    res=m*[n*[0]]
    i=0
    while i<m:
        j=0
        while j<n:
            res[j][i]=m1[i][j]
            j+=1
        i+=1
    return res


m1=[
    [1,2,3],
    [4,5,6],
    [7,8,9],
]
m2=[
    [7,8,9],
    [1,2,3],
    [4,5,6],
]

print(tranMat(m1))
print(tranMat(m2))
