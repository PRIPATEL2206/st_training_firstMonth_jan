class Queue:
    arr=[]
    def insert(self, value):
        self.arr.append(value)
    def delete(self):
        value=self.arr[0]
        self.arr=self.arr[1:]
        return value
    def display(self):
        for i in self.arr:
            print(i," - ",end="")
        print()

q1=Queue()
q1.insert(1)
q1.insert(2)
q1.insert(3)
q1.insert(4)
q1.display()
q1.delete()
q1.display()

