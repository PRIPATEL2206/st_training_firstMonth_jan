a=int(input("Enter coefficient a:"))
b=int(input("Enter coefficient b:"))
c=int(input("Enter coefficient c:"))

d= b*b - (4*a*c)

if d <0:
    print("Roots are imaginary")
    print(-b+(d**0.5)/(2*a))
    print(-b-(d**0.5)/(2*a))
elif b==0:
    print("Roots are equal and real")
    print(-b/(2*a))    
else:
    print("Roots are different and real")
    print(-b+(d**0.5)/(2*a))
    print(-b-(d**0.5)/(2*a))    