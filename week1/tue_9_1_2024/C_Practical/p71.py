dtr={
     "M":1000,
     "D":500,
     "C":100,
     "L":50,
     "X":10,
     "V":5,
     "I":1
     }
ind=[100,900,500,400,100,90,50,40,10,9,5,4,1]

def romToDes(s:str):
    res=0
    i=0
    n=len(s)
    while i<n:
        s1=dtr[s[i]]
        if i<n-1 and s1<dtr[s[i+1]]: 
            res+=dtr[s[i+1]]-s1
            i+=2
            continue
        res+=s1
        i+=1

    return res

n=input("enter the number in roman: ")
print(romToDes(n))