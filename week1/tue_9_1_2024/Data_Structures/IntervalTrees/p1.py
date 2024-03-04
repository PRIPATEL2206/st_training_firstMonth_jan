class IntervalTreeNode:
    def __init__(self, start, end):
        self.start = start
        self.end = end
        self.max_end = end
        self.left = None
        self.right = None

class IntervalTree:
    def __init__(self):
        self.root = None

    def insert(self, node, start, end):
        if node is None:
            return IntervalTreeNode(start, end)

        node.max_end = max(node.max_end, end)

        if start < node.start:
            node.left = self.insert(node.left, start, end)
        else:
            node.right = self.insert(node.right, start, end)

        return node

    def insert_interval(self, start, end):
        self.root = self.insert(self.root, start, end)

    def search_overlapping_intervals(self, node, start, end):
        if node is None or start > node.max_end or end < node.start:
            return []

        if start <= node.start and end >= node.end:
            return [(node.start, node.end)]

        return (
            self.search_overlapping_intervals(node.left, start, end) +
            self.search_overlapping_intervals(node.right, start, end)
        )

    def search_overlapping(self, start, end):
        return self.search_overlapping_intervals(self.root, start, end)

interval_tree = IntervalTree()
interval_tree.insert_interval(15, 20)
interval_tree.insert_interval(10, 30)
interval_tree.insert_interval(17, 19)
interval_tree.insert_interval(5, 20)

search_result = interval_tree.search_overlapping(14, 21)
print("Overlapping intervals:", search_result)