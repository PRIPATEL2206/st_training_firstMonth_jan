class Queue:
    start:int
    end:int
    arr:list
    n:int
    def __init__(self,n) -> None:
        self.start=-1
        self.end=-1
        self.arr=n*[0]
        self.n=n
    
    def push(self,value):
        if(self.end>=self.n-1):
            print("quew is full")
        self.end+=1
        self.arr[self.end]=value
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
        return value
    def top(self):
        if(self.start==-1):
            print("queu is empty")
            return
        return self.arr[self.start]
    def display(self):
        if(self.start==-1):
            return
        for i in range(self.start,self.end+1):
            print(self.arr[i],"<-", end="")
        print()
        
    

q=Queue(5)
for i in range(5):
    q.push(i)
q.display()
q.pop()
q.display()

