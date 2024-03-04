class Node:
    left=None
    right=None
    val:int

    def __init__(self,val):
        self.val=val

def BFS(head:Node):
    q=[]
    if head==None:
        return
    print(head.val," -> ",end="")
    q.append(head.left) if  head.left!=None else None
    q.append(head.right) if  head.right!=None else None
    while len(q)!= 0:
        val=q.pop(0)
        print(val.val," -> ",end="")
        q.append(val.left) if  val.left!=None else None
        q.append(val.right) if  val.right!=None  else None

'''
       1
  2       3
4   5   6    7
'''
head=Node(1)
head.left=Node(2)
head.right=Node(3)
head.left.left=Node(4)
head.left.right=Node(5)
head.right.left=Node(6)
head.right.right=Node(7)

BFS(head)


