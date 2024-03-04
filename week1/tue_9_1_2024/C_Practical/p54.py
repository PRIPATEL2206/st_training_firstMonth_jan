def sumOfDiag(m:list):
    n=len(m)
    i=0
    su=0
    while i<n:
        su+=m[i][i]
        i+=1
    return su

m1=[
    [1,2,3],
    [4,5,6],
    [7,8,9],
]

print(sumOfDiag(m1))