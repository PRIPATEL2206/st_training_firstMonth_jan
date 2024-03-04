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
        if(i>='0' and i<='9'):
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

def evaluate(a,b,o):
    match o:
        case '+':
            return a+b
        case '-':
            return a-b
        case '*':
            return a*b
        case '/':
            return a/b
        case '^':
            return a**b

def posfixEvaluate(string:str):
    string=infixToPostfix(string)
    stack=Stack()
    for i in string:
        if(i>="0" and i<="9"):
            stack.push(int(i))
        else:
            o2=stack.pop()
            o1=stack.pop()
            res=evaluate(o1,o2,i)
            stack.push(res)
    return stack.pop()


print(posfixEvaluate("2+3*4"))