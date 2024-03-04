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

def firstNonRepeating(s:str):
    ht=HashTable()
    for i in s:
        ht.insert(i,i)
    for i in s:
        if len(ht.values[i])==1:
            return i

s=input("enter the string : ")
print(firstNonRepeating(s) ,"is first non repiting")