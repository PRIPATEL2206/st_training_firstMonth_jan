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

def reverseStr(string:str):
    sta=Stack()
    reverse=""
    for i in string:
        sta.push(i)
    while not sta.isEmpty():
        reverse+=sta.pop()
    return reverse

print(reverseStr("this is string"))