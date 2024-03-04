class Queue:
    arr=[]
    def insert(self, value):
        self.arr.append(value)
    def delete(self):
        value=self.arr[0]
        self.arr=self.arr[1:]
        return value
    def length(self):
        return len(self.arr)
    def display(self):
        for i in self.arr:
            print(i," - ",end="")
        print()

def genBin(n:int):
    ans=[]
    q=Queue()
    q.insert("1")
    while n>0 :
        n -= 1
        s1 = q.delete()
        ans.append(s1)
        s2 = s1 
        q.insert(s1+"0")
        q.insert(s2+"1")
    return ans
print(genBin(5))