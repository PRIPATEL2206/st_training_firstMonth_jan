class HashTable:
    data:dict
    n:int
    def __init__(self,n) -> None:
        self.data={i:[] for i in range(n)}
        self.n=n
    def keyFor(self,data):
        return int(str(data)[0])%self.n
    def insert(self,data):
        self.data[self.keyFor(data)].append(data)
    def delete(self,data):
        dataItem=self.data[self.keyFor(data)]
        i=0
        n=len(dataItem)
        while i<n:
            if dataItem[i]==data:
                break
            i+=1
        dataItem=dataItem[:i]+dataItem[i+1:]
    def display(self):
        print(self.data)

ht=HashTable(10)
ht.insert(1)
ht.insert(2)
ht.insert(0)
ht.insert(10)
ht.insert(5)

ht.display()


