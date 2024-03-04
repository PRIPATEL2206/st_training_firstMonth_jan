def isAnagrams(a,b):
   return sorted(a)==sorted(b) 
a=input("eneter string 1 : ")
b=input("eneter string 2 : ")
if isAnagrams(a,b):
   print(a," and ",b ," are Anagrams")
else:
   print(a," and ",b ," are not Anagrams")
