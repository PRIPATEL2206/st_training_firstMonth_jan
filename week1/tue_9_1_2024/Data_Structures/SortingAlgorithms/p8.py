def redixSort(arr):
    arrs=list(map(str,arr))
    maxI=max(map(len,arrs))
    arrs=["0"*(maxI-len(i))+i for i in arrs]
    i=0

    n=len(arr)
    # used buble sort
    for k in range(maxI-1,-1,-1):
        print(k)
        while i<n:
            j=0
            while j<n-i-1:
                if int(arrs[j][:k+1])>int(arrs[j+1][:k+1]):
                    arrs[j],arrs[j+1]=arrs[j+1],arrs[j]
                j+=1
            i+=1
        print(arrs)
        

    arr[:]= list(map(int,arrs))
arr = [12, 11, 13, 6, 5, 7]
redixSort(arr)
print("Sorted array is")
print(*arr)