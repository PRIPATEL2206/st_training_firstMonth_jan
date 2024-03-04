class Node:
    left=None
    right=None
    val:int

    def __init__(self,val):
        self.val=val

def inoreder(head:Node):
    s=[]
    if head==None:
        return
    s.append(head.right) if  head.right!=None else None
    s.append(head.val)
    s.append(head.left) if  head.left!=None else None
    while len(s):
        val=s.pop()
        if type(val) is int:
            print(val," -> ",end="" )
            continue
        s.append(val.right) if  val.right!=None  else None
        s.append(val.val)
        s.append(val.left) if  val.left !=None else None
    print()

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

inoreder(head)


      