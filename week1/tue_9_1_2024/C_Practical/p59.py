class Node:
    data=0
    nextNode=None
    def __init__(self,data) -> None:
        self.data=data

class CircularLinkList:
    head:Node
    def __init__(self,data) -> None:
        self.head=Node(data=data)
        self.head.nextNode=self.head
    def insert(self,data):
        if self.head==None:
            self.head=Node(data=data)
            self.head.nextNode=self.head
            return
        temp=self.head.nextNode
        while  temp.nextNode!=self.head:
            temp=temp.nextNode
        temp.nextNode=Node(data=data)
        temp.nextNode.nextNode=self.head
    
    def delete(self,data):
        if(self.head.data==data):
            temp=self.head.nextNode
            while temp.nextNode!=self.head:
                temp=temp.nextNode
            temp.nextNode=self.head.nextNode
            self.head=self.head.nextNode
            return
        temp=self.head.nextNode
        prew=self.head
        while temp!=self.head and temp.data!=data:
            prew=temp
            temp=temp.nextNode
        prew.nextNode=temp.nextNode
    def display(self):
        if(not self.head):
            return
        temp=self.head
        print(temp.data," -> ",end="")
        temp=temp.nextNode
        while(temp!=self.head):
            print(temp.data," -> ",end="")
            temp=temp.nextNode
        print()
l1=CircularLinkList(0)
for i in range(1,100):
    l1.insert(i)
l1.delete(5)
l1.display()