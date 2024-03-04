def countWord(s:str):
    n=0
    for i in s.split():
        n+=1
    return n

s=input("eneter string : ")
print("words are : ",countWord(s))