class CircularQueue:
    arr:list
    start:int
    end:int
    n:int
    def __init__(self,n:int) -> None:
        self.arr=n*[0]
        self.n=n
        self.start=-1
        self.end=-1
    def insert(self, value):
        if(self.end==self.n-1):
            if(self.start==0):
                print("index out of bound")
                return
            self.end=0
            self.arr[self.end]=value
            return
        self.end+=1
        self.arr[self.end]=value
        if(self.start==-1):
            self.start+=1
    
    def delete(self):
        islast=False            
        if(self.end==self.start):
            islast=True
        value=self.arr[self.start]
        self.start+=1
        if islast:
            self.start=-1
            self.end=-1
        if(self.start==self.n):
            self.start=0
        return value
        
    def length(self):
        if self.start==-1:
            return 0
        if self.end<self.start:
            return self.n-self.start+self.end+1
        return self.end-self.start
    def display(self):
        arr=self.arr[self.start:]+self.arr[:self.end+1] if self.start>self.end else self.arr[self.start:self.end+1]
        for i in arr:
            print(i," - ",end="")
        print()

q=CircularQueue(5)
for i in range(5):
    q.insert(i)
q.delete()
q.insert(5)
q.display()