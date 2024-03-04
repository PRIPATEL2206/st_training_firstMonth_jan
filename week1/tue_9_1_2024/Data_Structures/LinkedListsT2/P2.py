class Node:
    data=0
    nextNode=None
    def __init__(self,data) -> None:
        self.data=data

class LinkList:
    head:Node
    length=0
    def __init__(self,data) -> None:
        self.head=Node(data=data)
        self.length+=1
    def insert(self,data):
        if self.head==None:
            self.head=Node(data=data)
        temp=self.head
        while temp.nextNode!=None:
            temp=temp.nextNode
        temp.nextNode=Node(data=data)
        self.length+=1
    
    def delete(self,data):
        if(self.head.data==data):
            self.head=self.head.nextNode
            self.length-=1            
            return
        temp=self.head.nextNode
        prew=self.head
        while temp!=None and temp.data!=data:
            prew=temp
            temp=temp.nextNode
        if temp.data==data:
            prew.nextNode=temp.nextNode
            self.length-=1            
    def display(self):
        temp =self.head
        while(temp!=None):
            print(temp.data," -> ",end="")
            temp=temp.nextNode
    def middelEle(self):
        mid=self.length//2+1
        temp=self.head
        while mid>1:
            temp=temp.nextNode
            mid-=1
        return temp.data


l1=LinkList(0)
for i in range(1,9):
    l1.insert(i)
l1.display()
print(l1.middelEle())

