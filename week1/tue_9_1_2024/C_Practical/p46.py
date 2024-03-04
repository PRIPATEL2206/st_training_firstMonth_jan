def fact(n:int):
    if(n==0 or n==1):
        return 1
    return n*fact(n-1)

def pascalTri(r:int):
    i=0
    while i<r:
        j=0
        print((r-i-1)*" ",end="")
        while j<=i:
            print(int(fact(i)/(fact(i-j)*fact(j))),end=" ")
            j+=1
        i+=1
        print()

n=int(input("enter the number of row : "))
pascalTri(n)