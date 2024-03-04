def binToDes(s:str):
    des=0
    for i,n in enumerate(s[::-1]):
        des+=int(n)*(2**i)
    return des

n=input()
print(binToDes(n))