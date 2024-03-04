class TrieNode:
    val=None
    childerns:dict
    def __init__(self,v) -> None:
         self.val=v
         self.childerns={}

def insert(head:TrieNode, s:str):
    n=len(s)
    i=0
    if len(s)==0:
        return
    if head==None:
        head=TrieNode(None)
        head.childerns[s[0]]=TrieNode(s[0])
        i+=1
    
    temp=head
    while i <n:
        if s[i] not in temp.childerns:
            temp.childerns[s[i]]=TrieNode(s[i])
        temp=temp.childerns[s[i]]
        i+=1

def search(head:TrieNode,s:str):
    if len(s)==0:
        return True
    if head==None:
        return False
    temp=head
    for i in s:
        if i not in temp.childerns:
            return False
        temp=temp.childerns[i]
    return True

head=TrieNode(None)
insert(head,"ok")  
print(search(head,"ok"))

    
    