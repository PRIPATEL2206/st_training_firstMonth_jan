class Node:
    left=None
    right=None
    value=0
    def __init__(self,value) -> None:
        self.value=value

class BinaryTree:
    head:Node=None
    def insert(self,head:Node,value):
        if head==None:
            self.head = Node(value)
            return
        if head.value > value:
            if head.left==None:
                head.left=Node(value)
            else:
                self.insert(head.left,value)
        else:
            if head.right == None:
                head.right=Node(value)
            else:
                self.insert(head.right,value)                   
    
    def search(self,head,value):
        if (head==None):
            return 
        elif head.value==value:
            print("value found ", value)
        elif head.value>value:
            self.search(head.left,value)
        else:
            self.search(head.right,value)
def inOrder(head:Node):
    if(head==None):
        return
    inOrder(head.left)
    print(head.value," -> ",end="")
    inOrder(head.right)

def getHeight(head:Node):
    if head==None:
        return 0
    return 1+max(getHeight(head.left),getHeight(head.right))


bt=BinaryTree()
bt.insert(bt.head,2)
bt.insert(bt.head,1)
bt.insert(bt.head,4)
bt.insert(bt.head,3)
bt.insert(bt.head,6)
bt.insert(bt.head,7)
bt.insert(bt.head,5)

inOrder(bt.head)
print()
print(getHeight(bt.head))