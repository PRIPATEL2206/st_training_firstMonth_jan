class Node:
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
            return Node(key)


        if key < root.key:
            root.left = self.insert(root.left, key)
        elif key > root.key:
            root.right = self.insert(root.right, key)
        else:
            return root  

        return self._balance(root)

    def delete(self, root, key):
        if not root:
            return root

        if key < root.key:
            root.left = self.delete(root.left, key)
        elif key > root.key:
            root.right = self.delete(root.right, key)
        else:
            if not root.left:
                return root.right
            elif not root.right:
                return root.left

            min_value = self._find_min_value(root.right)
            root.key = min_value
            root.right = self.delete(root.right, min_value)

        return self._balance(root)

    def _find_min_value(self, root):
        while root.left:
            root = root.left
        return root.key

    def search(self, root, key):
        if not root or root.key == key:
            return root

        if key < root.key:
            return self.search(root.left, key)
        return self.search(root.right, key)

    def insert_key(self, key):
        self.root = self.insert(self.root, key)

    def delete_key(self, key):
        self.root = self.delete(self.root, key)

    def search_key(self, key):
        return self.search(self.root, key)


avl_tree = AVLTree()
keys = [9, 5, 10, 0, 6, 11, -1, 1, 2]

for key in keys:
    avl_tree.insert_key(key)


print("AVL Tree after insertions:")


key_to_search = 10
if avl_tree.search_key(key_to_search):
    print(f"{key_to_search} found in the AVL Tree.")
else:
    print(f"{key_to_search} not found in the AVL Tree.")

avl_tree.delete_key(10)
print("AVL Tree after deletion of key 10:")
