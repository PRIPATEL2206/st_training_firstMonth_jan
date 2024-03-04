def subMat(m1:list,m2:list):
    res=[]
    i=0
    j=0
    m=len(m1)
    n=len(m1[0])
    while i<m:
        sr=[]
        j=0
        while j<n:
            sr.append(m1[i][j]-m2[i][j])
            j+=1
        res.append(sr)
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
print(subMat(m1,m2))
