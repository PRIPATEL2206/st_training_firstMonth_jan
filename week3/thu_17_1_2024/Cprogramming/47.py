# file 47.py
import random

class Node:
    def __init__(self, key, level):
        self.key = key
        self.forward = [None] * (level + 1)

class SkipList:
    def __init__(self, max_level):
        self.max_level = max_level
        self.header = self.create_node(float('-inf'), max_level)
        self.level = 0

    def create_node(self, key, level):
        new_node = Node(key, level)
        return new_node

    def random_level(self):
        level = 0
        while random.random() < 0.5 and level < self.max_level:
            level += 1
        return level

    def insert(self, key):
        update = [None] * (self.max_level + 1)
        current = self.header

        for i in range(self.level, -1, -1):
            while current.forward[i] and current.forward[i].key < key:
                current = current.forward[i]
            update[i] = current

        new_level = self.random_level()

        if new_level > self.level:
            for i in range(self.level + 1, new_level + 1):
                update[i] = self.header
            self.level = new_level

        new_node = self.create_node(key, new_level)

        for i in range(new_level + 1):
            new_node.forward[i] = update[i].forward[i]
            update[i].forward[i] = new_node

    def search(self, key):
        current = self.header

        for i in range(self.level, -1, -1):
            while current.forward[i] and current.forward[i].key < key:
                current = current.forward[i]

        current = current.forward[0]

        if current and current.key == key:
            print(f"Key {key} found in Skip List.")
        else:
            print(f"Key {key} not found in Skip List.")

    def display(self):
        print("Skip List:")
        for i in range(self.level + 1):
            node = self.header.forward[i]
            elements = []
            while node:
                elements.append(str(node.key))
                node = node.forward[i]
            print(f"Level {i}: {' -> '.join(elements)}")


# Example Usage:
skip_list = SkipList(max_level=4)

keys_to_insert = [3, 6, 7, 9, 12, 16, 19, 22]
for key in keys_to_insert:
    skip_list.insert(key)

skip_list.display()

skip_list.search(7)
skip_list.search(10)
