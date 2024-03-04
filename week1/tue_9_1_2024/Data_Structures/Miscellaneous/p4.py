def kthSmallst(arr:list,k):
    i=0
    n=len(arr)
    while i<n:
        j=i
        mi=i
        while j<n:
            if arr[mi]>arr[j]:
                mi=j
            j+=1
        if min!=i:
            arr[mi],arr[i]=arr[i],arr[mi]
        k-=1
        if k==0:
            return arr[i]
        i+=1


arr=[3, 3, 4, 2, 4, 4, 2, 4, 4]
k=4
print("arr is : ",arr)
print(k," smalest element is : ",kthSmallst(arr,k))
