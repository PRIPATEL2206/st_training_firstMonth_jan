def sumOfDigit(n:int):
    s=0
    while(n!=0):
        s+=n%10
        n=n//10
    return s

n=int(input())
print(sumOfDigit(n))