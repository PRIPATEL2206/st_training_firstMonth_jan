import heapq
from collections import defaultdict

codes = {}

freq = defaultdict(int)

class MinHeapNode:
	def __init__(self, data, freq):
		self.left = None
		self.right = None
		self.data = data
		self.freq = freq

	def __lt__(self, other):
		return self.freq < other.freq

def printCodes(root, str):
	if root is None:
		return
	if root.data != '$':
		print(root.data, ":", str)
	printCodes(root.left, str + "0")
	printCodes(root.right, str + "1")

def storeCodes(root, str):
	if root is None:
		return
	if root.data != '$':
		codes[root.data] = str
	storeCodes(root.left, str + "0")
	storeCodes(root.right, str + "1")

def HuffmanCodes(size):
	global minHeap
	for key in freq:
		minHeap.append(MinHeapNode(key, freq[key]))
	heapq.heapify(minHeap)
	while len(minHeap) != 1:
		left = heapq.heappop(minHeap)
		right = heapq.heappop(minHeap)
		top = MinHeapNode('$', left.freq + right.freq)
		top.left = left
		top.right = right
		heapq.heappush(minHeap, top)
	storeCodes(minHeap[0], "")

def calcFreq(str, n):
	for i in range(n):
		freq[str[i]] += 1

def decode_file(root, s):
	ans = ""
	curr = root
	n = len(s)
	for i in range(n):
		if s[i] == '0':
			curr = curr.left
		else:
			curr = curr.right

		if curr.left is None and curr.right is None:
			ans += curr.data
			curr = root
	return ans + '\0'

if __name__ == "__main__":
	minHeap = []
	str = "geeksforgeeks"
	encodedString, decodedString = "", ""
	calcFreq(str, len(str))
	HuffmanCodes(len(str))
	print("Character With there Frequencies:")
	for key in sorted(codes):
		print(key, codes[key])

	for i in str:
		encodedString += codes[i]

	print("\nEncoded Huffman data:")
	print(encodedString)

	decodedString = decode_file(minHeap[0], encodedString)
	print("\nDecoded Huffman Data:")
	print(decodedString)
