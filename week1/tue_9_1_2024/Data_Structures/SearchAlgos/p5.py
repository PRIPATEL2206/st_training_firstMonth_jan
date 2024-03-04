def interpolationSearch(arr,l,r,v):
    index=int(l+((r-l)/(arr[r]-arr[l])*(v-arr[l])))
    if arr[index]==v:
        return index+1
    elif arr[index]>v:
        return interpolationSearch(arr,l,index-1,v)
    return interpolationSearch(arr,l,index-1,v)

arr=list(map(int,input("enter the array : ").split()))
v=int(input("enter value to search : "))
so=sorted(arr)

print("sorted array sorted array  : ",so)
print("value is on index  : ",interpolationSearch(so,0,len(arr)-1,v))