n=int(input("Enter a number:"))

s=str(n)

if s[-1]=='7':
    print('Buzz Number')
elif n%7==0:
    print('Buzz Number')
else:
    print('Not a Buzz Number')        