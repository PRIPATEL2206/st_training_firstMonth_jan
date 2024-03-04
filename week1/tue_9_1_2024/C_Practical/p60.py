class Node:
    left=None
    right=None
    value=0
    def __init__(self,value) -> None:
        self.value=value
def inOrder(head:Node):
    if(head==None):
        return
    inOrder(head.left)
    print(head.value," -> ",end="")
    inOrder(head.right)

def preOrder(head:Node):
    if(head==None):
        return
    print(head.value," -> ",end="")
    preOrder(head.left)
    preOrder(head.right)

def postOrder(head:Node):
    if(head==None):
        return
    postOrder(head.left)
    postOrder(head.right)
    print(head.value," -> ",end="")

'''
      1
  2       3
4  5    6   7
'''

head=Node(1)
head.left=Node(2)
head.right=Node(3)
head.left.left=Node(4)
head.left.right=Node(5)
head.right.left=Node(6)
head.right.right=Node(7)

inOrder(head)
print()
preOrder(head)
print()
postOrder(head)
print()