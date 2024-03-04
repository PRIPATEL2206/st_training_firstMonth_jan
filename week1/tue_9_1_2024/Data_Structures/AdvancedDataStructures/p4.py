class SegmentTree:
    def __init__(self, arr):
        self.arr = arr
        self.n = len(arr)
        self.tree = [0] * (2 * self.n)

        # Build the segment tree
        self._build(0, 0, self.n - 1)

    def _build(self, index, left, right):
        if left == right:
            self.tree[index] = self.arr[left]
            return

        mid = (left + right) // 2
        left_child = 2 * index + 1
        right_child = 2 * index + 2

        self._build(left_child, left, mid)
        self._build(right_child, mid + 1, right)

        self.tree[index] = self.tree[left_child] + self.tree[right_child]

    def query(self, query_left, query_right):
        return self._query(0, 0, self.n - 1, query_left, query_right)

    def _query(self, index, segment_left, segment_right, query_left, query_right):
        # No overlap
        if query_right < segment_left or query_left > segment_right:
            return 0

        # Complete overlap
        if query_left <= segment_left and query_right >= segment_right:
            return self.tree[index]

        # Partial overlap
        mid = (segment_left + segment_right) // 2
        left_child = 2 * index + 1
        right_child = 2 * index + 2

        left_sum = self._query(left_child, segment_left, mid, query_left, query_right)
        right_sum = self._query(right_child, mid + 1, segment_right, query_left, query_right)

        return left_sum + right_sum


# Example usage
arr = [1, 3, 5, 7, 9, 11]
segment_tree = SegmentTree(arr)

# Query the sum of elements in the range [1, 4]
result = segment_tree.query(1, 4)
print("Sum in range [1, 4]:", result)
