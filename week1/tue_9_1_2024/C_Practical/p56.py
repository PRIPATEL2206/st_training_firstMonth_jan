class Node:
    data=0
    nextNode=None
    def __init__(self,data) -> None:
        self.data=data

class LinkList:
    head:Node
    def __init__(self,data) -> None:
        self.head=Node(data=data)
    def insert(self,data):
        if self.head==None:
            self.head=Node(data=data)
        temp=self.head
        while temp.nextNode!=None:
            temp=temp.nextNode
        temp.nextNode=Node(data=data)
    
    def delete(self,data):
        if(self.head.data==data):
            self.head=self.head.nextNode
            print("return")
            return
        temp=self.head.nextNode
        prew=self.head
        while temp!=None and temp.data!=data:
            prew=temp
            temp=temp.nextNode
        prew.nextNode=temp.nextNode
    def display(self):
        temp =self.head
        while(temp!=None):
            print(temp.data," -> ",end="")
            temp=temp.nextNode
            
l1=LinkList(0)
for i in range(1,10):
    l1.insert(i)
l1.delete(5)
l1.display()