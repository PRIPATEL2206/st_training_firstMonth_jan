class Complex:
    real=0
    imagenary=0
    
    def __init__(self,real:int,img:int) -> None:
        self.real=real
        self.imagenary=img
    
    def __add__(self,o):
        return Complex(self.real+o.real,self.imagenary+o.imagenary)