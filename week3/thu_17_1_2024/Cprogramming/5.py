def factorial(n):
    if n==0:
        return 1
    return factorial(n-1)*n

def Permutation(n,r):
    n1=factorial(n)
    n2=factorial(n-1)
    permut=int(n1/n2)
    return permut
def Combination(n,r):
    n1=factorial(n)
    n2=factorial(n-r)
    r=factorial(r)
    
    combi=int(n1/(n2*r))    
    return combi
n=int(input("Enter total number of items:"))
r=int(input("Enter selected items from n:"))
if r>n:
    print("Invalid Input!")
else:    
    print("Permutation:",Permutation(n,r))    
    print("Combination:",Combination(n,r))    