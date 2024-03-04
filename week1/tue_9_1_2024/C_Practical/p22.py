def isPerfect(n:int):
    s=1
    i=2
    while(i<=n//2+1):
        if (n%i==0):
            s+=i
        i+=1
    return s==n and n!=1

n=int(input("Enter the number :"))
if isPerfect(n):
    print(n," is Perfect number")
else:
    print(n," is not Perfect number")
