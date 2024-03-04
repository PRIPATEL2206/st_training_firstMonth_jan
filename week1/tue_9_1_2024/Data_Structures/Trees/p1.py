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
    def inOrder(self,head:Node):
        if(head==None):
            return []
        left=self.inOrder(head.left)
        right=self.inOrder(head.right)
        print(left)
        print(self.head.value)
        # print(right)
        return left+[self.head.value]+right
    def search(self,head,value):
        if (head==None):
            return 
        elif head.value==value:
            print("value found ", value)
        elif head.value>value:
            self.search(head.left,value)
        else:
            self.search(head.right,value)
        



def minimum(node):
    current_node=node
    while(current_node.left is not None):
        current_node=current_node.left                          
    return current_node


def delete(root:Node,key):
     if root is None:
        return root
     if key < root.value:
        root.left = delete(root.left, key)
     elif(key > root.value):
        root.right = delete(root.right, key)
     else:
        if root.left is None:
            temp = root.right
            root = None
            return temp

        elif root.right is None:
            temp = root.left
            root = None
            return temp
                   
        temp = minimum(root.right)
        root.value = temp.value
        root.right = delete(root.right, temp.value)
        return root




'''
      1
  2       3
4  5    6   7
'''

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
bt.search(bt.head,6)
head=delete(bt.head,6)
inOrder(bt.head)

