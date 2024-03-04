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
        case _:
            return None

a=int(input("enter value 1 : "))
b=int(input("enter value 2 : "))
o=input("enter opareter : ")

print(evaluate(a,b,o))