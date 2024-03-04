def holowPiramid(r:int):
    i=0
    while i<r:
        j=0
        print((r-i-1)*" ",end="")
        while j<=i:
            if i==r-1 or j==0 or j==i:
                print("*",end=" ")
            else:
                print("  ",end="")
            j+=1
        print()
        i+=1


n=int(input("enter the number of row : "))
holowPiramid(n)