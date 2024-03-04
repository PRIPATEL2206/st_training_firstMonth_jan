def isPelemdrom(s:str):
    n=len(s)
    for i in range(n//2):
        if s[i]!=s[-i-1]:
            return False
    return True

sen=input("enter sentence : ")
print("reverse sentence is : ",isPelemdrom(sen))