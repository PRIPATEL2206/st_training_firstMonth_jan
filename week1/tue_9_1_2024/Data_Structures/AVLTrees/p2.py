class TreeNode:
    def __init__(self, key):
        self.key = key
        self.left = None
        self.right = None
        self.height = 1


class AVLTree:
    def __init__(self):
        self.root = None

    def _height(self, node):
        if not node:
            return 0
        return node.height

    def _update_height(self, node):
        if not node:
            return 0
        node.height = 1 + max(self._height(node.left), self._height(node.right))

    def _balance_factor(self, node):
        if not node:
            return 0
        return self._height(node.left) - self._height(node.right)

    def _rotate_right(self, y):
        x = y.left
        T2 = x.right

        x.right = y
        y.left = T2

        self._update_height(y)
        self._update_height(x)

        return x

    def _rotate_left(self, x):
        y = x.right
        T2 = y.left

        y.left = x
        x.right = T2

        self._update_height(x)
        self._update_height(y)

        return y

    def _balance(self, node):
        if not node:
            return node

        self._update_height(node)

        balance = self._balance_factor(node)

        if balance > 1:
            
            if self._balance_factor(node.left) < 0:
                node.left = self._rotate_left(node.left)
            return self._rotate_right(node)

        
        if balance < -1:
         
            if self._balance_factor(node.right) > 0:
                node.right = self._rotate_right(node.right)
            return self._rotate_left(node)

        return node

    def insert(self, root, key):
        if not root:
            return TreeNode(key)


        if key < root.key:
            root.left = self.insert(root.left, key)
        elif key > root.key:
            root.right = self.insert(root.right, key)
        else:
            return root  

        return self._balance(root)

    def sorted_array_to_avl(self, nums):
        for num in nums:
            self.root = self.insert(self.root, num)

    def inorder_traversal(self, root):
        if root:
            self.inorder_traversal(root.left)
            print(root.key, end=" ")
            self.inorder_traversal(root.right)


sorted_array = [1, 2, 3, 4, 5, 6, 7, 8, 9]

avl_tree = AVLTree()
avl_tree.sorted_array_to_avl(sorted_array)

print("Inorder traversal of the AVL tree representing the balanced BST:")
avl_tree.inorder_traversal(avl_tree.root)