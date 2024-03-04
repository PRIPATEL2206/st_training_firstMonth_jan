def majorityElement(s:list):
    n=len(s)
    di={}
    for i in s:
        if i in di:
            di[i]+=1
        else:
            di[i]=1
        if di[i]>n//2:
            return i
    return -1

arr=[3, 3, 4, 2, 4, 4, 2, 4, 4]
print("arr is : ",arr)
print("majority is : ",majorityElement(arr))