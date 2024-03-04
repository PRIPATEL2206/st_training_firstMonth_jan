def isLipyear(y:int):
    return y%400 or (y%4==0 and y%100!=0)

y=int(input("enter the year : "))
if isLipyear(y):
    print(y," is leap year")
else: 
    print(y," is not Leap year")