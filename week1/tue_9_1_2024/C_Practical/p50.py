def dimandPatten(r:int):
    i=0
    while i<r:
        j=0
        print((r-i-1)*" ",end="")
        while j<=i:
            if j==0 or j==i:
                print("*",end=" ")
            else:
                print("  ",end="")
            j+=1
        print()
        i+=1
    i-=1
    while i>=0:
        j=0
        print((r-i-1)*" ",end="")
        while j<=i:
            if j==0 or j==i:
                print("*",end=" ")
            else:
                print("  ",end="")
            j+=1
        print()
        i-=1


n=int(input("enter the number of row : "))
dimandPatten(n)