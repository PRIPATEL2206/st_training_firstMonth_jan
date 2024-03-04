class Node:
    def __init__(self, key, value, color, left=None, right=None):
        self.key = key
        self.value = value
        self.color = color  
        self.left = left
        self.right = right

class PersistentRedBlackTree:
    def __init__(self):
        self.versions = {}  
        self.current_version = 0

    def insert(self, key, value):
        root = self.get_version(self.current_version)
        new_root = self._insert(root, key, value)
        self.current_version += 1
        self.versions[self.current_version] = new_root

    def _insert(self, node, key, value):
        if not node:
            return Node(key, value, 1)  

        if key < node.key:
            left = self._insert(node.left, key, value)
            return self.balance(Node(node.key, node.value, node.color, left, node.right))
        elif key > node.key:
            right = self._insert(node.right, key, value)
            return self.balance(Node(node.key, node.value, node.color, node.left, right))
        else:
            
            return Node(key, value, node.color, node.left, node.right)

    def search(self, key, version=None):
        if version is None:
            version = self.current_version
        root = self.get_version(version)
        return self._search(root, key)

    def _search(self, node, key):
        while node:
            if key < node.key:
                node = node.left
            elif key > node.key:
                node = node.right
            else:
                return node.value
        return None

    def balance(self, node):
        if not node:
            return None

        if node.color == 1:  
            return node

        if node.left and node.left.color == 1 and node.left.left and node.left.left.color == 1:
            
            return Node(
                node.left.key,
                node.left.value,
                1,
                Node(node.left.left.key, node.left.left.value, 0, node.left.left.left, node.left.left.right),
                Node(node.key, node.value, 0, node.left.right, node.right),
            )

        if node.left and node.left.color == 1 and node.left.right and node.left.right.color == 1:
            
            return Node(
                node.left.right.key,
                node.left.right.value,
                1,
                Node(node.left.key, node.left.value, 0, node.left.left, node.left.right.left),
                Node(node.key, node.value, 0, node.left.right.right, node.right),
            )

        if node.right and node.right.color == 1 and node.right.left and node.right.left.color == 1:
            
            return Node(
                node.right.left.key,
                node.right.left.value,
                1,
                Node(node.key, node.value, 0, node.left, node.right.left.left),
                Node(node.right.key, node.right.value, 0, node.right.left.right, node.right.right),
            )

        if node.right and node.right.color == 1 and node.right.right and node.right.right.color == 1:
            
            return Node(
                node.right.key,
                node.right.value,
                1,
                Node(node.key, node.value, 0, node.left, node.right.left),
                Node(node.right.right.key, node.right.right.value, 0, node.right.right.left, node.right.right.right),
            )

        return node

    def get_version(self, version):
        return self.versions.get(version, None)


persistent_tree = PersistentRedBlackTree()
persistent_tree.insert(10, "Version 1")
persistent_tree.insert(20, "Version 1")
persistent_tree.insert(30, "Version 1")
persistent_tree.insert(15, "Version 2")
persistent_tree.insert(25, "Version 2")
result_v1 = persistent_tree.search(15, version=1)
result_v2 = persistent_tree.search(15, version=2)

print(result_v1)  
print(result_v2)  
