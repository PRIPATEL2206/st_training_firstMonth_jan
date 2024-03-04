
def isPrime(n:int):
    for i in range(2,n//2+1):
        if(n % i==0):
            return False
    return True

n=int(input())
print(isPrime(n))
