class Node:
    data=0
    nextNode=None
    def __init__(self,data) -> None:
        self.data=data

def isCycle(head:Node):
    if(head ==None or head.nextNode==None):
        return False
    turtal=head
    rabit=head.nextNode
    while(turtal!=rabit and rabit.nextNode!=None and rabit.nextNode.nextNode!=None):
        turtal=turtal.nextNode
        rabit=rabit.nextNode.nextNode

    if(turtal==rabit):
        return True
    return False



l1=Node(1)
l1.nextNode=Node(2)
l1.nextNode.nextNode=Node(3)
l1.nextNode.nextNode.nextNode=Node(4)
print(isCycle(l1))
l1.nextNode.nextNode.nextNode.nextNode=l1.nextNode
print(isCycle(l1))