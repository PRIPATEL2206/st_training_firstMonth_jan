def stringLen(s:str):
    n=0
    for i in s:
        n+=1
    return n

s=input("eneter the string: ")
print("length is : ",stringLen(s))