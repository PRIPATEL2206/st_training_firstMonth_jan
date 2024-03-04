# file 43.py
import itertools

def calculate_overlap(s1, s2):
    max_overlap = 0
    for i in range(1, min(len(s1), len(s2)) + 1):
        if s1[-i:] == s2[:i]:
            max_overlap = i
    return max_overlap

def merge_strings(s1, s2, overlap):
    return s1 + s2[overlap:]

def shortest_superstring(strings):
    while len(strings) > 1:
        max_overlap = 0
        merge_indices = (0, 1)

        for i, j in itertools.combinations(range(len(strings)), 2):
            overlap = calculate_overlap(strings[i], strings[j])
            if overlap > max_overlap:
                max_overlap = overlap
                merge_indices = (i, j)

        i, j = merge_indices
        merged = merge_strings(strings[i], strings[j], max_overlap)
        strings.pop(j)
        strings[i] = merged

    return strings[0]

# Example Usage:
string_set = ["catgc", "ctaagt", "gcta", "ttca", "atgcatc"]
result = shortest_superstring(string_set)
print(f"Shortest Superstring: {result}")
