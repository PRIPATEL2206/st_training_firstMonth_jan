def binarySearch(arr,v,start,end):
    if(start>end):
        return None
    mid=start+(end-start)//2
    if(arr[mid]==v):
        return mid+1
    if(arr[mid]>v):
        return binarySearch(arr,v,start,mid)
    return binarySearch(arr,v,mid,end)

def searchinRotetedSortedArr(arr,s):
    rotateIndex=0
    while rotateIndex<len(arr)-1 and arr[rotateIndex]<arr[rotateIndex+1]:
        rotateIndex+=1
    l=binarySearch(arr,s,0,rotateIndex)
    if l!=None:
        return l
    return binarySearch(arr,s,rotateIndex+1,len(arr))

def rotate(arr,k):
    return arr[k:]+arr[:k]

arr=list(map(int,input("enter the array : ").split()))
r=int(input("enter value by which array will rotate : "))
v=int(input("enter value to search : "))
so=rotate(sorted(arr),r)

print("sorted array roteted arr  : ",so)
print("value is on index  : ",binarySearch(so,v,0,len(arr)-1))
