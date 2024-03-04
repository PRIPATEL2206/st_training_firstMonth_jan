def suffixArray(s:str):
    n=len(s)
    sarr=[ [i,s[i:] ]for i in range(n)]
    sarr.sort(key=lambda e:e[1])
    return [i[0] for i in sarr]
    

s="prince"
print(suffixArray(s))