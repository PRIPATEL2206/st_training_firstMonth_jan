# file 39.py
class TrieNode:
    def __init__(self):
        self.children = {}
        self.output = None
        self.failure = None

def build_aho_corasick(patterns):
    root = TrieNode()

    for pattern in patterns:
        node = root
        for char in pattern:
            if char not in node.children:
                node.children[char] = TrieNode()
            node = node.children[char]
        node.output = pattern

    queue = []
    for child in root.children.values():
        queue.append(child)
        child.failure = root

    while queue:
        current = queue.pop(0)
        for char, child in current.children.items():
            queue.append(child)
            failure = current.failure
            while failure and char not in failure.children:
                failure = failure.failure
            child.failure = failure.children[char] if failure else root

    return root

def aho_corasick(text, root):
    result = []
    node = root

    for i, char in enumerate(text):
        while node and char not in node.children:
            node = node.failure
        if not node:
            node = root
            continue
        node = node.children[char]
        if node.output:
            result.append((i - len(node.output) + 1, node.output))

    return result

# Example Usage:
patterns = ["he", "she", "his", "hers"]
text = "ushers"
root = build_aho_corasick(patterns)
matches = aho_corasick(text, root)
print("Pattern matches:", matches)
