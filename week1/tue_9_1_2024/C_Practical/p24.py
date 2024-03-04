def gcd(a:int,b:int):
    if(a>b):
        return gcd (b,a)
    if(a==0):
        return b
    if a==b:
        return b
    return gcd(a,b%a)

a=int(input("eneter the value of a : "))
b=int(input("eneter the value of b : "))
print("gcd is : ",gcd(a,b))
