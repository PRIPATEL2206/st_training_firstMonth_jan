class RadixNode:
    def __init__(self, key=None, value=None):
        self.key = key
        self.value = value
        self.children = {}

class RadixTree:
    def __init__(self):
        self.root = RadixNode()

    def insert(self, key, value):
        self._insert(self.root, key, value)

    def _insert(self, node, key, value):
        if not key:
            node.value = value
            return

        prefix, suffix = self._common_prefix(node.key, key)
        if prefix:
            if suffix:
                # Split the current node
                child = RadixNode(key=suffix, value=value)
                child.children = node.children
                node.children = {suffix[0]: child}
                node.key = prefix
                node.value = None
            else:
                # The key is already in the tree
                node.value = value
        else:
            # No common prefix, find the child to insert
            common_child = self._find_common_child(node, key)
            if common_child:
                # Recur to the child node
                self._insert(node.children[common_child], key[len(common_child):], value)
            else:
                # Create a new child node
                node.children[key[0]] = RadixNode(key=key, value=value)

    def search(self, key):
        return self._search(self.root, key)

    def _search(self, node, key):
        if not key:
            return node.value

        common_child = self._find_common_child(node, key)
        if common_child:
            return self._search(node.children[common_child], key[len(common_child):])
        return None

    def _common_prefix(self, str1, str2):
        common_prefix = []
        i = 0
        while i < len(str1) and i < len(str2) and str1[i] == str2[i]:
            common_prefix.append(str1[i])
            i += 1

        return ''.join(common_prefix), str1[i:]

    def _find_common_child(self, node, key):
        for child_key, child_node in node.children.items():
            common_prefix, _ = self._common_prefix(key, child_key)
            if common_prefix:
                return child_key
        return None

# Example usage:
def radix_tree_example():
    radix_tree = RadixTree()

    keys_to_insert = ["apple", "app", "banana", "orange", "orc"]
    for key in keys_to_insert:
        radix_tree.insert(key, f"value_of_{key}")

    print("Radix tree after insertion:")
    for key in keys_to_insert:
        value = radix_tree.search(key)
        print(f"Key: {key}, Value: {value}")

    key_to_search = "app"
    result = radix_tree.search(key_to_search)
    print(f"Search result for key '{key_to_search}': {result}")

radix_tree_example()
