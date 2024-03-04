class CartesianTreeNode:
    def __init__(self, key, value, left=None, right=None):
        self.key = key
        self.value = value
        self.left = left
        self.right = right

def build_cartesian_tree(arr):
    if not arr:
        return None

    root = CartesianTreeNode(arr[0], 0)
    stack = [[root, float('-inf'), float('inf')]]

    for idx, value in enumerate(arr[1:], start=1):
        node = CartesianTreeNode(value, idx)

        while stack and (value < stack[-1][0].key or value > stack[-1][2]):
            popped, lower, _ = stack.pop()
            if value < popped.key:
                popped.left = node
            else:
                popped.right = node
            node = popped

        if stack:
            stack[-1][0] = node
            stack.append([node, stack[-1][0].key, float('inf')])
        else:
            stack.append([node, float('-inf'), float('inf')])

    return root

def query_at_time(root, key, time):
    if not root:
        return None

    while root:
        if key == root.key and root.value <= time:
            return root.value

        if key < root.key:
            root = root.left
        else:
            root = root.right

    return None


arr = [3, 5, 1, 4, 2]
initial_tree = build_cartesian_tree(arr)


result_at_time_1 = query_at_time(initial_tree, 4, 1)
result_at_time_2 = query_at_time(initial_tree, 4, 2)

print(f"Query result at time 1: {result_at_time_1}")
print(f"Query result at time 2: {result_at_time_2}")