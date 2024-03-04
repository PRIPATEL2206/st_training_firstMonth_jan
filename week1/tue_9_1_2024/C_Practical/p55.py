def isMagicSqure(m:list):
    n=len(m)
    i=0
    j=0
    s=sum(m[0])
    s2=0
    while i<n:
        s1=sum(m[i])
        s2+=m[i][i]
        if(s1!=s):
            return False
        i+=1
    if(s2!=s):
        return False
    s2=0
    i=0
    while i<n:
        j=0
        s2=0
        while j<n:
            s2+=m[j][i]
            j+=1
        if(s2!=s):
            return False
        i+=1
    return True

m1=[
    [1,2,3],
    [4,5,6],
    [7,8,9],
]
m2=[
    [1,1,1],
    [1,1,1],
    [1,1,1],
]

print(isMagicSqure(m1))
print(isMagicSqure(m2))