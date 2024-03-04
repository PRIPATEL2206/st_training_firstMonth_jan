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

ht=HashTable()
ht.insert(1,1)
ht.insert(2,2)
ht.insert(3,3)

ht.delete(2,2)
ht.insert(2,3)            
print(ht.search(2,3))