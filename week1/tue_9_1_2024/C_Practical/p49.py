def floydTring(n:int):
    i=0
    c=1
    while i<n:
        j=0
        while j<=i:
            print(c,end=" ")
            c+=1
            j+=1
        print()
        i+=1 

n=int(input("enter the number of row : "))
floydTring(n)