a,b,c=map(int,input().split())

if(a>b):
    if(a>c):
        print(a," is maximum number")
    else:
        print(c," is maximum number")
elif(b>c):
    print(b," is maximum number")
else:
    print(c," is maximum number")