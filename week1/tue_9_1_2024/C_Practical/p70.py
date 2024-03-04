dtr={1000:"M",900:"CM",500:"D",400:"CD",100:"C",90:"XC",50:"L",40:"XL",10:"X",9:"IX",5:"V",4:"IV",1:"I"}
ind=[100,900,500,400,100,90,50,40,10,9,5,4,1]

def desToRom(n:int):
    res=""
    for i in ind:
        # print(i)
        while n%i==0 and  n>0:
            res+= dtr[i]
            n-=i
            # print(n)
    return res

n=int(input("enter the number : "))
print(desToRom(n))