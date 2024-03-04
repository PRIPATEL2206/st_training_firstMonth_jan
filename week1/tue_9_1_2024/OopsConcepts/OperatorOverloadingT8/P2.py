class Complex:
    real=0
    imagenary=0
    
    def __init__(self,real:int,img:int) -> None:
        self.real=real
        self.imagenary=img
    
    def __add__(self,o):
        return Complex(self.real+o.real,self.imagenary+o.imagenary)
    
c1=Complex(2,5)
c2=Complex(3,4)
c3=c1+c2

print(c3.real,"+",c3.imagenary,"i")
