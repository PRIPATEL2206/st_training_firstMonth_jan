def firtAndLastOfArr(arr,a):
    i=0
    while i<len(arr) and arr[i]!=a:
        i+=1
    first=i+1
    while i<len(arr) and arr[i]==a:
        i+=1
    last=i
    return first,last


arr=list(map(int,input("enter the array : ").split()))
v=int(input("enter value to search : "))
so=sorted(arr)
print("sorted array is  : ",so)
print("value is first and last at  : ",firtAndLastOfArr(so,v))

    
