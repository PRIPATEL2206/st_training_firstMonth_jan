class Node:
    def __init__(self, value):
        self.value = value
        self.marked = False
        self.next = None

def schorr_waite_algorithm(root):
    if not root or root.marked:
        return

    current = root
    while current:
        if not current.marked:
            current.marked = True
            print(f"Marked node with value: {current.value}")
            schorr_waite_algorithm(current.next)
        current = current.next

def display(node):
    current = node
    while current:
        print(f"Node with value: {current.value}, Marked: {current.marked}")
        current = current.next
# Example Usage:
# Create a simple linked list for demonstration
node1 = Node(1)
node2 = Node(2)
node3 = Node(3)

node1.next = node2
node2.next = node3

# Call the Schorr-Waite algorithm on the root of the linked list
print("Before Garbage Collection:")
display(node1)

schorr_waite_algorithm(node1)

print("\nAfter Garbage Collection:")
display(node1)