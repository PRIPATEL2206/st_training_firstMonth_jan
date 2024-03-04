def gcd(a:int,b:int):
    if(a>b):
        return gcd (b,a)
    if(a==0):
        return b
    if a==b:
        return b
    return gcd(a,b%a)
def lcm(a,b):
    return a*b/(gcd(a,b))


def gcdOfArr(arr:list):
    g=arr[0]
    for i in arr[1:]:
        g=gcd(g,i)
    return g

def lcmOfArr(arr:list):
    l=arr[0]
    for i in arr[1:]:
        l=lcm(l,i)
    return int(l)

arr=list(map(int,input("enter array : ").split()))
print("gcd is : ",gcdOfArr(arr))
print("lcm is : ",lcmOfArr(arr))