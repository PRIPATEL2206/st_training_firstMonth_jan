# file 40.py
import heapq
from collections import defaultdict, Counter

class HuffmanNode:
    def __init__(self, char, freq):
        self.char = char
        self.freq = freq
        self.left = None
        self.right = None

    def __lt__(self, other):
        return self.freq < other.freq

def build_huffman_tree(data):
    heap = [HuffmanNode(char, freq) for char, freq in Counter(data).items()]
    heapq.heapify(heap)

    while len(heap) > 1:
        left = heapq.heappop(heap)
        right = heapq.heappop(heap)
        merged = HuffmanNode(None, left.freq + right.freq)
        merged.left, merged.right = left, right
        heapq.heappush(heap, merged)

    return heap[0]

def build_huffman_codes(root, code="", mapping=None):
    if mapping is None:
        mapping = {}
    if root:
        if root.char is not None:
            mapping[root.char] = code
        build_huffman_codes(root.left, code + "0", mapping)
        build_huffman_codes(root.right, code + "1", mapping)
    return mapping

def huffman_encode(data, mapping):
    encoded_data = "".join(mapping[char] for char in data)
    return encoded_data

def huffman_decode(encoded_data, root):
    decoded_data = ""
    current = root
    for bit in encoded_data:
        if bit == "0":
            current = current.left
        else:
            current = current.right
        if current.char is not None:
            decoded_data += current.char
            current = root
    return decoded_data

# Example Usage:
data = "abracadabra"
huffman_tree = build_huffman_tree(data)
huffman_mapping = build_huffman_codes(huffman_tree)
encoded_data = huffman_encode(data, huffman_mapping)
decoded_data = huffman_decode(encoded_data, huffman_tree)

print("Original data:", data)
print("Encoded data:", encoded_data)
print("Decoded data:", decoded_data)
