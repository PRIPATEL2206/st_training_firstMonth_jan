def josephus(n, k):
    if n == 1:
        return 1
    else:
       
        return (josephus(n - 1, k) + k - 1) % n + 1


total_people = 7
elimination_count = 4

survivor_position = josephus(total_people, elimination_count)
print(f"The survivor is at position {survivor_position}.")