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

def solve(q:Queue,k:int):
    if(k==0):
        return
    v=q.delete()
    solve(q,k-1)
    q.insert(v)

def reverseK(q:Queue,k:int):
    solve(q,k)
    s=q.length()-k
    for _ in range(s):
        v=q.delete()
        q.insert(v)

q=Queue()
for i in range(8):
    q.insert(i)
q.display()
reverseK(q,3)
q.display()

