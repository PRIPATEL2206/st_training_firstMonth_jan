def desToBin(n:int):
    s=""
    while(n!=0):
        s+=str(n%2)
        n=n//2
    return s[::-1]

n=int(input())
print(desToBin(n))