def reverseSentence(s:str):
    return " ".join(s.split()[::-1])

sen=input("enter sentence : ")
print("reverse sentence is : ",reverseSentence(sen))