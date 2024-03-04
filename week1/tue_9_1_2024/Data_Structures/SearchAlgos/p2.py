def binarySearch(arr,v,start,end):
    if(start>end):
        return None
    mid=start+(end-start)//2
    if(arr[mid]==v):
        return mid+1
    if(arr[mid]>v):
        return binarySearch(arr,v,start,mid)
    return binarySearch(arr,v,mid,end)

arr=list(map(int,input("enter the array : ").split()))
v=int(input("enter value to search : "))
so=sorted(arr)

print("sorted array is  : ",so)
print("value is on index  : ",binarySearch(so,v,0,len(arr)-1))


