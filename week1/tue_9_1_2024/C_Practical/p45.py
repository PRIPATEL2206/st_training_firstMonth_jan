def isLowerTriMat(m1:list):
    m=len(m1)
    n=len(m1[0])
    i=1
    sum=0
    while i<m:
        j=0
        while j<i:
            sum+=m1[j][i]
            j+=1
        i+=1
    return sum==0

m1=[
    [1,0,0],
    [4,5,0],
    [7,8,9],
]
m2=[
    [7,8,9],
    [0,2,3],
    [0,0,0],
]
print(isLowerTriMat(m1))
print(isLowerTriMat(m2))
