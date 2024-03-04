def fibonacci(n:int,fibo:list):
    if fibo[n-1]!=-1:
        return fibo[n-1]
    if n==1:
        fibo[0]=1
    elif n==2:
        fibo[1]=1
    else:
        fibo[n-1]=fibonacci(n-2,fibo)+fibonacci(n-1,fibo)
    return fibo[n-1]

def fibonacci_t(n:int,fibo:list):

    fibo[0]=1
    fibo[1]=1
    for i in range(2,n):
        fibo[i]=fibo[i-2]+fibo[i-1]
    return fibo[n-1]

n=int(input("enter the number : "))
arr=n*[-1]
print("fibonacci of ",n," is ",fibonacci_t(n,arr))

    