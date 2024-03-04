class Node:
    data=0
    nextNode=None
    def __init__(self,data) -> None:
        self.data=data

def getIntersection( head1:Node,head2:Node):
    while(head2):
        temp=head1
        while(temp):
            if(temp==head2):
                return head2
            temp=temp.nextNode
        head2=head2.nextNode
    return None

# l1
l1=Node(1)
l1.nextNode=Node(2)
l1.nextNode.nextNode=Node(3)
# l2
l2=Node(4)
l2.nextNode=Node(5)
l2.nextNode.nextNode=Node(6)

print(getIntersection(l1,l2))

l2.nextNode.nextNode.nextNode=l1
print(getIntersection(l1,l2).data)