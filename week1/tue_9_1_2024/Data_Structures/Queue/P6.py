class Queue:
    start:int
    end:int
    arr:list
    n:int
    minele:int
    def __init__(self,n) -> None:
        self.start=-1
        self.end=-1
        self.arr=n*[0]
        self.n=n
        self.minele=None
    
    def push(self,value):
        if(self.end>=self.n-1):
            print("quew is full")
        self.end+=1
        self.arr[self.end]=value
        self.minele= value if self.minele==None else min(self.minele,value)
        if(self.start==-1):
            self.start+=1
            self.end=0

    def pop(self):
        if(self.start==-1):
            print("queu is empty")
            return
        value=self.arr[self.start]
        self.start+=1
        
        if(self.start==self.n):
            self.start=-1
            self.end=-1
            self.minele=None
        else:
            self.minele=min(self.arr[self.start:self.end+1])        
        return value
    
    def getMin(self):
        return self.minele
    
    def top(self):
        if(self.start==-1):
            print("queu is empty")
            return
        return self.arr[self.start]

q=Queue(5)
for i in range(6,10):
    q.push(i)
q.push(2)
q.pop()
print(q.getMin())