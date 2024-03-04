class Deque:
    start:int
    end:int
    arr:list
    n:int
    def __init__(self,n) -> None:
        self.start=-1
        self.end=-1
        self.arr=n*[0]
        self.n=n
    
    def insertRight(self,value):
        if(self.end>=self.n-1):
            print("quew is full")
            return
        self.end+=1
        self.arr[self.end]=value
        if(self.start==-1):
            self.start+=1
            self.end+=1

    def insertLeft(self,value):
        if(self.start==0):
            print("quew is full")
            return
        if self.start==-1:
            self.start=0
            self.end=0
            self.arr[self.start]=value
            return
        self.start-=1
        self.arr[self.start]=value
        if(self.start==-1):
            self.start+=1
            self.end+=1

    def deleteLeft(self):
        if(self.start==-1):
            print("queu is empty")
            return
        value=self.arr[self.start]
        self.start+=1
        if(self.start==self.n):
            self.start=-1
            self.end=-1
        return value
    
    def deleteRight(self):
        if(self.end==-1):
            print("queu is empty")
            return
        value=self.arr[self.end]
        self.end-=1
        if(self.end==-1):
            self.start=-1
        return value
    
    def topLeft(self):
        if(self.start==-1):
            print("queu is empty")
            return
        return self.arr[self.start]
    def topRight(self):
        if(self.start==-1):
            print("queu is empty")
            return
        return self.arr[self.end]
    

q=Deque(5)
for i in range(6,10):
    q.insertRight(i)