class Stack:
    data=[]

    def push(self,value):
        self.data.append(value)
    def pop(self):
       if self.isEmpty():
           return None
       return self.data.pop()
    def pip(self):
        if self.isEmpty():
         return None
        return self.data[-1]
    def isEmpty(self):
        return len(self.data)==0
    def display(self):
        for i in self.data[::-1]:
            print("| ",i," |")
            print(" ------")

s=Stack()
for i in range(5):
    s.push(i)
s.display()