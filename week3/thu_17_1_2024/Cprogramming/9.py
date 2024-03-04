def checkHarshad( n ) : 
    sum = 0
    temp = n 
    while temp > 0 : 
        sum = sum + temp % 10
        temp = temp // 10

    return n % sum == 0

if(checkHarshad(120)): 
    print("Yes") 
else: 
    print ("No") 
  
if (checkHarshad(15)): 
    print("Yes") 
else: 
    print ("No") 