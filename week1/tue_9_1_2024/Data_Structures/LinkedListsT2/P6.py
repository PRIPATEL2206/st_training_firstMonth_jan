class Node:
    data=0
    nextNode=None
    def __init__(self,data) -> None:
        self.data=data

def display(head:Node):
        temp =head
        while(temp!=None):
            print(temp.data," -> ",end="")
            temp=temp.nextNode

def removeDuplcates(head:Node):
    if head==None:
        return head
    temp=head.nextNode
    prews=head
    arr=[prews.data]
    while(temp):
        
        if(temp.data in arr):
            prews.nextNode=temp.nextNode
            temp=temp.nextNode
        else:
            arr.append(temp.data)
            prews=prews.nextNode
            temp=temp.nextNode
        # print(arr)

l1=Node(0)
l1.nextNode=Node(1)
l1.nextNode.nextNode=Node(2)
l1.nextNode.nextNode.nextNode=Node(3)
l1.nextNode.nextNode.nextNode.nextNode=Node(0)
l1.nextNode.nextNode.nextNode.nextNode.nextNode=Node(3)
l1.nextNode.nextNode.nextNode.nextNode.nextNode.nextNode=Node(4)
display(l1)
removeDuplcates(l1)
print()
display(l1)
        