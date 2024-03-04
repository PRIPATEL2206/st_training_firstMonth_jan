class Node:
    left=None
    right=None
    val:int

    def __init__(self,val):
        self.val=val

def lca(head:Node,p:int,q:int):
    if head==None:
        return
    ma=max(p,q)
    mi=min(p,q)
    if head.val in [p,q] or (head.val<ma and head.val>mi):
        return head
    if head.val>ma and head.val>mi:
        return lca(head.left,p,q)

    return lca(head.right,p,q)


'''
       6
  2       8
0   4   7    9
   3  5
'''
head=Node(6)
head.left=Node(2)
head.right=Node(8)
head.left.left=Node(0)
head.left.right=Node(4)
head.right.left=Node(7)
head.right.right=Node(9)
head.left.right.left=Node(3)
head.left.right.right=Node(5)

print(lca(head,7,9).val)



     