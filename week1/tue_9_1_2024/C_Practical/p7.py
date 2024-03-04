def nfibonacci(n:int):
    if(n==1):
         return 1
    elif n==2:
         return 1
    return nfibonacci(n-1)+ nfibonacci(n-2)

n=int(input())
print(nfibonacci(n))
    