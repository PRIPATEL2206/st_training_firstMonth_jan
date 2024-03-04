def lenearSearch(arr:list,v):
    for i,n in enumerate(arr):
        if n==v:
            return i+1
    return None

arr=list(map(int,input("enter the array : ").split()))
v=int(input("enter value to search : "))

print("value is on index  : ",lenearSearch(arr,v))


