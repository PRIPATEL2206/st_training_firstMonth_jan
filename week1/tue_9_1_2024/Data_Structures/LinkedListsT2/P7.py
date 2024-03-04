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

def sumOfLinkList(head:Node):
    temp=head
    total=0
    while(temp):
         total+=temp.data
         temp=temp.nextNode
    return total

l1=Node(0)
temp=l1
for i in range(5):
    temp.nextNode=Node(i)
    temp=temp.nextNode
display(l1)
print()
print("sum is : ",sumOfLinkList(l1))