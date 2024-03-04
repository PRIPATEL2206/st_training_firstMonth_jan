class HashTable:
    values:dict[int:list]={}
    def insert(self,key,value):
        if key in self.values:
            self.values[key].append(value)
        else:
            self.values[key]=[value]

    def delete(self,key,value):
        if key in self.values:
            self.values[key].remove(value)

    def search(self,key,value):
        if key in self.values:
            return self.values[key].index(value)
        
def intersection(arr1:list,arr2:list):
    ht=HashTable()
    for i in arr1:
        if  i not in ht.values:
            ht.insert(i,i)
    
    res=set()
    for i in arr2:
        if i in ht.values:
            res.add(i)
    return list(res)

arr1=map(int,input("enter value of arr1 : ").split())
arr2=map(int,input("enter value of arr2 : ").split())

print(intersection(arr1,arr2))