def selectionSort(arr:list):
    i=0
    n=len(arr)
    while i<n:
        j=i
        m=i
        while j<n:
            if(arr[m]>arr[j]):
                m=j
            j+=1
        arr[m],arr[i]=arr[i],arr[m]
        i+=1
    return arr


arr=list(map(int,input("enter the array : ").split()))
print("sorted array is : ",selectionSort(arr))

