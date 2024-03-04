import re

string=input("Enter a string:")
string=re.sub(r'[^\w]','',string)

if (string[::-1]==string):
    print('Entered string is palindrome')
else:
    print('Not a palindrome')    