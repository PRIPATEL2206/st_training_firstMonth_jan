def powerOfHanoy(n:int,sours:str,des:str,ext:str):
    if(n==0):
        return
    powerOfHanoy(n-1,sours=sours,des=ext,ext=des)
    print("move disk ",n," form rod ",sours," to ",des)
    powerOfHanoy(n-1,sours=ext,des=des,ext=sours)

powerOfHanoy(3,"a","b","c")