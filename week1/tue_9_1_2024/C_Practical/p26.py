def factore(n:int):
    fact=[1]
    i=2
    while(i<=n//2+1):
        if(n%i==0):
            fact.append(i)
        i+=1
    fact.append(n)
    return fact

n=int(input("eneter the value of n : "))
print("factore is : ",*factore(n))