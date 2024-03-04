class Node:
    left=None
    right=None
    value=0
    def __init__(self,value) -> None:
        self.value=value

def DFS(head:Node):
    if(head==None):
        return
    DFS(head.left)
    DFS(head.right)
    print(head.value," -> ",end="")

'''
      1
  2       3
4  5    6   7
'''

t=Node(1)
t.left=Node(2)
t.right=Node(3)
t.left.left=Node(4)
t.left.right=Node(5)
t.right.left=Node(6)
t.right.right=Node(7)

DFS(t)