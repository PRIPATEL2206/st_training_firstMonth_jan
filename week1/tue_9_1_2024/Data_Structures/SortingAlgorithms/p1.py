def bubulSort(arr:list):
    i=0
    n=len(arr)
    while i<n:
        j=0
        while j<n-i-1:
            if(arr[j]>arr[j+1]):
                arr[j],arr[j+1]=arr[j+1],arr[j]
            j+=1
        i+=1
    return arr

arr=list(map(int,input("enter the array : ").split()))
print("sorted array is : ",bubulSort(arr))

