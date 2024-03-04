def numPatten(n:int):
    i=0
    while i<n:
        j=0
        while j<=i:
            print(i+1,end="")
            j+=1
        print()
        i+=1


n=int(input("enter the number of row : "))
numPatten(n)