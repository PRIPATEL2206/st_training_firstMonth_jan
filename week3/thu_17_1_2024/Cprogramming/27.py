def suffix_array(string:str):
    suffix_arr={}
    for i in range(0,len(string)):
        suffix_arr[i]=string[i:]
    suffix_arr=dict(sorted(suffix_arr.items() ,key=lambda item: item[1]))
    print(suffix_arr.keys())


suffix_array("banana")        