def countVovelConsonants(s:str):
    v=0
    c=0
    vovels=['a','e','i','o','u']
    for i in s.lower():
        if(i>='a' and i<='z') :
            if(i in vovels):
                v+=1
            else:
                c+=1
    return v,c

s=input("enter the string : ")
v,c=countVovelConsonants(s)
print("vovels are : ",v)
print("Consonants are : ",c)
            
