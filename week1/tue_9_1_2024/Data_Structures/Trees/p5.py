class Node:
    left=None
    right=None
    val:int

    def __init__(self,val):
        self.val=val

def isIdentical(t1 :Node,t2:Node):
    if t1==None or t2==None:
        return t1==t2
    
    return t1.val==t2.val and  isIdentical(t1.left,t2.left) and isIdentical(t1.right,t2.right)

t1=Node(1)
t1.left=Node(2)
t1.right=Node(3)
t1.left.left=Node(4)
t1.left.right=Node(5)
t1.right.left=Node(6)
t1.right.right=Node(7)

t2=Node(1)
t2.left=Node(2)
t2.right=Node(3)
t2.left.left=Node(4)
t2.left.right=Node(5)
t2.right.right=Node(6)
t2.right.left=Node(7)

print(isIdentical(t1,t1))
print(isIdentical(t1,t2))