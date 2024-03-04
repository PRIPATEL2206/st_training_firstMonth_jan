def countingSort(arr):
    MAX=max(arr)
    count=MAX*[0]
    for i in arr:
        count[i-1]+=1
    i=1
    k=0
    for i,n in enumerate(count):
        for _ in range(n):
            arr[k]=i
            k+=1

arr = [12, 11, 13, 5, 6, 7]
countingSort(arr)
print("Sorted array is")
print(*arr)