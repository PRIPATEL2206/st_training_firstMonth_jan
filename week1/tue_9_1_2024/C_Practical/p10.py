def pelindrom(n):
    s=str(n)
    i=0
    n=len(s)
    while(i<n//2+1):
        if s[i]!=s[n-i-1]:
            return False
        i+=1
    return True


n=input()
print(pelindrom(n))