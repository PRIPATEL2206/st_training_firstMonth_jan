def isArmstrong (n):
    temp=n
    s=0
    while(n!=0):
        s+=(n%10)**3
        n=n//10
    return temp==s

n=int(input("Enter the number :"))
if isArmstrong(n):
    print(n," is Armstrong number")
else:
    print(n," is not Armstrong number")
