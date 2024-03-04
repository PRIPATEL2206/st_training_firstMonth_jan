dis=["km","m","cm"]
wig=["kg","g","mg"]
def convert(n,s,d):
    if s in dis:
        return n*10**(dis.index(d)-dis.index(s)) 
    if s in wig:
        return n*10**(wig.index(d)-wig.index(s)) 


inp=input("enter value : ").split()
n,s=int(inp[0]),inp[1].lower()
d=input("enter output type : ").lower()

print("output : ",convert(n,s,d)," ",d)