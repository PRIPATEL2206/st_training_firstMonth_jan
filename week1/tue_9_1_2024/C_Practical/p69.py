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

def isBalancedParenThesis(s:str):
    di={
        "(":")",
        "[":"]",
        "{":"}",
    }
    stack=Stack()
    for i in s:
        if (not stack.isEmpty()) and di[stack.pip()]==i:
            stack.pop()
        else:
            stack.push(i)
    if(stack.isEmpty()):
        return True
    return False

print(isBalancedParenThesis("(())"))


