def mulMat(m1:list,m2:list):
    res=[]
    i=0
    m=len(m1)
    n=len(m1[0])
    while(i<m):
        j=0
        sr=[]
        while j<m:
            k=0
            sum=0
            while k<n:
                sum+=m1[i][k]*m2[k][j]
                k+=1
            sr.append(sum)
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

print(mulMat(m1,m2))
