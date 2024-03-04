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

pres={
    '^':3,
    '/':2,
    '*':2,
    '+':1,
    '-':1,
    '(':-1
}

def infixToPostfix(string:str):
    res=""
    stack=Stack()
    for i in string:
        if(i>='a' and i<='z') or (i>='A' and i<='Z'):
            res+=i
        elif(i=='('):
            stack.push(i)
        elif(i==')'):
            while ((not stack.isEmpty()) and stack.pip()!='('):
                res+=stack.pop()
            if not stack.isEmpty():
                stack.pop()
        else:
            while (not stack.isEmpty()) and pres[stack.pip()]>pres[i]:
                res+=stack.pop()
            stack.push(i)
    while not stack.isEmpty():
        res+=stack.pop()
    return res

print(infixToPostfix("a*b/c-d"))